/*******************************************************************************
 * Copyright (c) 2006, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.tests.unit.diff;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.tests.util.EcoreModelUtils;
import org.eclipse.emf.compare.util.EFactory;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

// TODO testing : these tests are not covering conflicting changes
/**
 * Tests the behavior of the generic diff engine. Be aware that these tests will take a while to be executed.
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 */
@SuppressWarnings("nls")
public class ThreeWayDiffTest extends TestCase {
	/** This is the resource holding the first model we'll use to test the differencing process. */
	private Resource testResource1;

	/** This is the resource holding the second model we'll use to test the differencing process. */
	private Resource testResource2;

	/**
	 * Tests the behavior of the GenericDiffEngine with two distinct EObjects (a model and its deep copy
	 * slightly modified). The left model will be used as common ancestor.
	 * <p>
	 * We're assuming that the matching process is returning the expected result as it has been tested through
	 * the org.eclipse.emf.compare.tests.unit.match.* tests.
	 * </p>
	 * 
	 * @throws FactoryException
	 *             Thrown if the comparison fails somehow.
	 */
	public void test3WayDiffDifferentModelsLocalChange() throws Exception {
		final int writerCount = 3;
		final int bookPerWriterCount = 5;
		final long seed = System.nanoTime();
		testResource1 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();
		testResource2 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();
		internalTest3WayDistinctModelsLocalChange();
	}

	/**
	 * Tests the behavior of the GenericDiffEngine with two distinct EObjects (a model and its deep copy
	 * slightly modified). The right model will be used as common ancestor.
	 * <p>
	 * We're assuming that the matching process is returning the expected result as it has been tested through
	 * the org.eclipse.emf.compare.tests.unit.match.* tests.
	 * </p>
	 * 
	 * @throws FactoryException
	 *             Thrown if the comparison fails somehow.
	 */
	public void test3WayDiffDifferentModelsRemoteChange() throws FactoryException {
		final int writerCount = 3;
		final int bookPerWriterCount = 5;
		final long seed = System.nanoTime();
		testResource1 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();
		testResource2 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();
		internalTest3WayDistinctModelsRemoteChange();
	}

	/**
	 * Tests the behavior of the GenericDiffEngine with two equal EObjects (a model and its deep copy). The
	 * left model will be used as common ancestor.
	 * <p>
	 * We're assuming that the matching process is returning the expected result as it has been tested through
	 * the org.eclipse.emf.compare.tests.unit.match.* tests.
	 * </p>
	 * 
	 * @throws FactoryException
	 *             Thrown if the comparison fails somehow.
	 */
	public void test3WayDiffEqualModelsLocalChange() throws FactoryException {
		final int writerCount = 3;
		final int bookPerWriterCount = 5;
		final long seed = System.nanoTime();
		testResource1 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();
		testResource2 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();

		MatchModel match = null;
		try {
			match = MatchService.doResourceMatch(testResource1, testResource2, testResource1, getOptions());
		} catch (final InterruptedException e) {
			fail("modelMatch() threw an unexpected Exception.");
		}
		assertNotNull("Failed to match the models.", match);

		final DiffModel diff = DiffService.doDiff(match, true);
		assertNotNull("Failed to compute the models' diff.", diff);

		final TreeIterator<EObject> diffIterator = diff.eAllContents();
		int elementCount = 0;
		while (diffIterator.hasNext()) {
			final DiffElement aDiff = (DiffElement)diffIterator.next();
			if (!(aDiff instanceof DiffGroup)) {
				elementCount++;
			}
		}

		assertEquals("There shouldn't have been a differences.", 0, elementCount);
	}

	/**
	 * Tests the behavior of the GenericDiffEngine with two equal EObjects (a model and its deep copy). The
	 * right model will be used as common ancestor.
	 * <p>
	 * We're assuming that the matching process is returning the expected result as it has been tested through
	 * the org.eclipse.emf.compare.tests.unit.match.* tests.
	 * </p>
	 * 
	 * @throws FactoryException
	 *             Thrown if the comparison fails somehow.
	 */
	public void test3WayDiffEqualModelsRemoteChange() throws FactoryException {
		final int writerCount = 3;
		final int bookPerWriterCount = 5;
		final long seed = System.nanoTime();
		testResource1 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();
		testResource2 = EcoreModelUtils.createModel(writerCount, bookPerWriterCount, seed).eResource();

		MatchModel match = null;
		try {
			match = MatchService.doResourceMatch(testResource1, testResource2, testResource1, getOptions());
		} catch (final InterruptedException e) {
			fail("modelMatch threw an unexpected InterruptedException.");
		}
		assertNotNull("Failed to match the two models.", match);

		final DiffModel diff = DiffService.doDiff(match, true);
		assertNotNull("Failed to compute the two models' diff.", diff);

		final TreeIterator<EObject> diffIterator = diff.eAllContents();
		int elementCount = 0;
		while (diffIterator.hasNext()) {
			final DiffElement aDiff = (DiffElement)diffIterator.next();
			if (!(aDiff instanceof DiffGroup)) {
				elementCount++;
			}
		}

		assertEquals("There shouldn't have been a single difference.", 0, elementCount);
	}

	/**
	 * Tests the behavior of the GenericDiffEngine with a <code>null</code> match model.
	 * <p>
	 * Expects a {@link NullPointerException} to be thrown.
	 * </p>
	 */
	public void test3WayDiffNullEObjects() {
		final String failNPE = "The differencing process did not throw the expected NullPointerException.";
		try {
			DiffService.doDiff((MatchModel)null, true);
			fail(failNPE);
		} catch (final NullPointerException e) {
			// This was expected behavior
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() {
		// voids the testResources (and hopes gc passes by ... should we hint at it here with System.gc?)
		if (testResource1 != null) {
			testResource1.getContents().clear();
		}
		if (testResource2 != null) {
			testResource2.getContents().clear();
		}
		testResource1 = null;
		testResource2 = null;
	}

	/**
	 * This will return the map of options to be used for comparisons within this test class.
	 * 
	 * @return Default options for matching.
	 */
	private Map<String, Object> getOptions() {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put(MatchOptions.OPTION_DISTINCT_METAMODELS, Boolean.TRUE);
		return options;
	}

	/**
	 * This handles the modification of the given model.
	 * <p>
	 * We'll retrieve the first Writer we find (see javadoc of {@link EcoreModelUtils#createMetaModel()}).
	 * First we copy this element, modify its name and void its "writtenBooks" reference to have a new element
	 * to add to the model, then we'll modify the original's "name" attribute to see if we can still match it.
	 * </p>
	 * 
	 * @param copyModel
	 *            The model to alter.
	 */
	private void internalModifyModel(EObject copyModel) {
		try {
			EObject originalWriter = null;
			EObject newElement = null;
			for (final EObject element : copyModel.eContents()) {
				if ("Writer".equals(element.eClass().getName())) {
					originalWriter = element;
					newElement = EcoreUtil.copy(element);
					break;
				}
			}
			// Change name
			EFactory.eSet(newElement, "name", "ThisNameShouldntHaveBeenUsedYet");
			// void books
			final List<Object> values = new ArrayList<Object>();
			values.addAll(EFactory.eGetAsList(newElement, "writtenBooks"));
			for (final Object aValue : values) {
				EFactory.eRemove(newElement, "writtenBooks", aValue);
			}
			// add this new element to model
			EFactory.eAdd(copyModel, "authors", newElement);
			// modify existing element
			EFactory.eSet(originalWriter, "name", "ModifiedWriterName");
		} catch (final FactoryException e) {
			/*
			 * Shouldn't have happened if we had found a Writer as expected. Consider it a failure
			 */
			fail("Couldn't modify original model to test differencing.");
		}
	}

	/**
	 * Handles the modification and comparison of the test models for distinct objects comparison.
	 * <p>
	 * Match failures should have been tested in the match engine test suite. As for the differencing
	 * failures, we expect to find an AddModelElement and an UpdateAttribute in the result. Externalized here
	 * to avoid copy/pasting within the two tests making use of it.
	 * </p>
	 */
	private void internalTest3WayDistinctModelsRemoteChange() {
		internalModifyModel(testResource2.getContents().get(0));

		MatchModel match = null;
		try {
			match = MatchService.doResourceMatch(testResource1, testResource2, testResource1, getOptions());
		} catch (final InterruptedException e) {
			fail("modelMatch() threw an unexpected InterruptedException.");
		}
		assertNotNull("Failed to match the three models.", match);

		final DiffModel diff = DiffService.doDiff(match, true);
		assertNotNull("Failed to compute the three models' diff.", diff);

		Collection<DiffElement> diffs = diff.getDifferences();
		// We're expecting two changes, one of which being a removal
		assertEquals("Unexpected count of differences.", 2, diffs.size());
		// assertEquals("Unexpected count of deletions in the DiffModel.", 1, deletionCount);
	}

	/**
	 * Handles the modification and comparison of the test models for distinct objects comparison.
	 * <p>
	 * Match failures should have been tested in the match engine test suite. As for the differencing
	 * failures, we expect to find a RemoteRemoveModelElement and a RemoteUpdateAttribute in the result.
	 * Externalized here to avoid copy/pasting within the two tests making use of it.
	 * </p>
	 * 
	 * @throws IOException
	 */
	private void internalTest3WayDistinctModelsLocalChange() throws IOException {
		internalModifyModel(testResource2.getContents().get(0));

		MatchModel match = null;
		try {
			match = MatchService.doResourceMatch(testResource1, testResource2, testResource2, getOptions());
		} catch (final InterruptedException e) {
			fail("modelMatch() threw an unexpected InterruptedException.");
		}
		assertNotNull("Failed to match the three models.", match);

		final DiffModel diff = DiffService.doDiff(match, true);
		assertNotNull("Failed to compute the three models' diff.", diff);

		Collection<DiffElement> diffs = diff.getDifferences();
		String v1 = ModelUtils.serialize(testResource1.getContents().get(0));
		String v2 = ModelUtils.serialize(testResource2.getContents().get(0));

		// We're expecting two changes, one of which being an addition
		assertEquals("Unexpected count of differences.", 2, diffs.size());
		// assertEquals("Unexpected count of additions in the DiffModel.", 1, additionCount);
	}
}
