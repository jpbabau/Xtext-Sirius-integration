/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl;

import org.eclipse.xtext.resource.IFragmentProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class StatemachineRuntimeModule extends org.eclipse.xtext.example.fowlerdsl.AbstractStatemachineRuntimeModule {

	
	public Class<? extends IFragmentProvider> bindIFragmentProvider() {
		return StatemachineFragmentProvider.class;
	}
}
