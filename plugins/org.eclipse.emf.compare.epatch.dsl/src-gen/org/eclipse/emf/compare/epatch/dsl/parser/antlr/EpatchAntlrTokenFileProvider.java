/*
 * generated by Xtext
 */
package org.eclipse.emf.compare.epatch.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EpatchAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader
				.getResourceAsStream("org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.tokens");
	}
}