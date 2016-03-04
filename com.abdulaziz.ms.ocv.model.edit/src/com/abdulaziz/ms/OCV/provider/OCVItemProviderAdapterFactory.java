/**
 */
package com.abdulaziz.ms.OCV.provider;

import com.abdulaziz.ms.OCV.util.OCVAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OCVItemProviderAdapterFactory extends OCVAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCVItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.UMLClassDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLClassDiagramItemProvider umlClassDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.UMLClassDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLClassDiagramAdapter() {
		if (umlClassDiagramItemProvider == null) {
			umlClassDiagramItemProvider = new UMLClassDiagramItemProvider(this);
		}

		return umlClassDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.UMLClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLClassItemProvider umlClassItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.UMLClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLClassAdapter() {
		if (umlClassItemProvider == null) {
			umlClassItemProvider = new UMLClassItemProvider(this);
		}

		return umlClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.UMLVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLVariableItemProvider umlVariableItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.UMLVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLVariableAdapter() {
		if (umlVariableItemProvider == null) {
			umlVariableItemProvider = new UMLVariableItemProvider(this);
		}

		return umlVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.UMLLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLLinkItemProvider umlLinkItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.UMLLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLLinkAdapter() {
		if (umlLinkItemProvider == null) {
			umlLinkItemProvider = new UMLLinkItemProvider(this);
		}

		return umlLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VSystemOperationDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSystemOperationDiagramItemProvider vSystemOperationDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VSystemOperationDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVSystemOperationDiagramAdapter() {
		if (vSystemOperationDiagramItemProvider == null) {
			vSystemOperationDiagramItemProvider = new VSystemOperationDiagramItemProvider(this);
		}

		return vSystemOperationDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VOperationItemProvider vOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVOperationAdapter() {
		if (vOperationItemProvider == null) {
			vOperationItemProvider = new VOperationItemProvider(this);
		}

		return vOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCContract} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCContractItemProvider vcContractItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCContract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCContractAdapter() {
		if (vcContractItemProvider == null) {
			vcContractItemProvider = new VCContractItemProvider(this);
		}

		return vcContractItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VContractPrecondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractPreconditionItemProvider vContractPreconditionItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VContractPrecondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVContractPreconditionAdapter() {
		if (vContractPreconditionItemProvider == null) {
			vContractPreconditionItemProvider = new VContractPreconditionItemProvider(this);
		}

		return vContractPreconditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VContractPostcondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractPostconditionItemProvider vContractPostconditionItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VContractPostcondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVContractPostconditionAdapter() {
		if (vContractPostconditionItemProvider == null) {
			vContractPostconditionItemProvider = new VContractPostconditionItemProvider(this);
		}

		return vContractPostconditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCLinkItemProvider vcLinkItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCLinkAdapter() {
		if (vcLinkItemProvider == null) {
			vcLinkItemProvider = new VCLinkItemProvider(this);
		}

		return vcLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCLinkPrePostCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCLinkPrePostConditionItemProvider vcLinkPrePostConditionItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCLinkPrePostCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCLinkPrePostConditionAdapter() {
		if (vcLinkPrePostConditionItemProvider == null) {
			vcLinkPrePostConditionItemProvider = new VCLinkPrePostConditionItemProvider(this);
		}

		return vcLinkPrePostConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCValueItemProvider vcValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCValueAdapter() {
		if (vcValueItemProvider == null) {
			vcValueItemProvider = new VCValueItemProvider(this);
		}

		return vcValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCEquality} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCEqualityItemProvider vcEqualityItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCEquality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCEqualityAdapter() {
		if (vcEqualityItemProvider == null) {
			vcEqualityItemProvider = new VCEqualityItemProvider(this);
		}

		return vcEqualityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCInstanceItemProvider vcInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCInstanceAdapter() {
		if (vcInstanceItemProvider == null) {
			vcInstanceItemProvider = new VCInstanceItemProvider(this);
		}

		return vcInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCInstanceField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCInstanceFieldItemProvider vcInstanceFieldItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCInstanceField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCInstanceFieldAdapter() {
		if (vcInstanceFieldItemProvider == null) {
			vcInstanceFieldItemProvider = new VCInstanceFieldItemProvider(this);
		}

		return vcInstanceFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCAssociationItemProvider vcAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCAssociationAdapter() {
		if (vcAssociationItemProvider == null) {
			vcAssociationItemProvider = new VCAssociationItemProvider(this);
		}

		return vcAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCParameterItemProvider vcParameterItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCParameterAdapter() {
		if (vcParameterItemProvider == null) {
			vcParameterItemProvider = new VCParameterItemProvider(this);
		}

		return vcParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCOperationBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCOperationBoxItemProvider vcOperationBoxItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCOperationBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCOperationBoxAdapter() {
		if (vcOperationBoxItemProvider == null) {
			vcOperationBoxItemProvider = new VCOperationBoxItemProvider(this);
		}

		return vcOperationBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCReturn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCReturnItemProvider vcReturnItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCReturn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCReturnAdapter() {
		if (vcReturnItemProvider == null) {
			vcReturnItemProvider = new VCReturnItemProvider(this);
		}

		return vcReturnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCCollectionBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCCollectionBoxItemProvider vcCollectionBoxItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCCollectionBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCCollectionBoxAdapter() {
		if (vcCollectionBoxItemProvider == null) {
			vcCollectionBoxItemProvider = new VCCollectionBoxItemProvider(this);
		}

		return vcCollectionBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCLoopItemProvider vcLoopItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCLoopAdapter() {
		if (vcLoopItemProvider == null) {
			vcLoopItemProvider = new VCLoopItemProvider(this);
		}

		return vcLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VCAlternativeBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCAlternativeBoxItemProvider vcAlternativeBoxItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VCAlternativeBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCAlternativeBoxAdapter() {
		if (vcAlternativeBoxItemProvider == null) {
			vcAlternativeBoxItemProvider = new VCAlternativeBoxItemProvider(this);
		}

		return vcAlternativeBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.ConditionOption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOptionItemProvider conditionOptionItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.ConditionOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionOptionAdapter() {
		if (conditionOptionItemProvider == null) {
			conditionOptionItemProvider = new ConditionOptionItemProvider(this);
		}

		return conditionOptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VContractAlternativeBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractAlternativeBoxItemProvider vContractAlternativeBoxItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VContractAlternativeBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVContractAlternativeBoxAdapter() {
		if (vContractAlternativeBoxItemProvider == null) {
			vContractAlternativeBoxItemProvider = new VContractAlternativeBoxItemProvider(this);
		}

		return vContractAlternativeBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VContractCollectionBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractCollectionBoxItemProvider vContractCollectionBoxItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VContractCollectionBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVContractCollectionBoxAdapter() {
		if (vContractCollectionBoxItemProvider == null) {
			vContractCollectionBoxItemProvider = new VContractCollectionBoxItemProvider(this);
		}

		return vContractCollectionBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.abdulaziz.ms.OCV.VContractLoopBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractLoopBoxItemProvider vContractLoopBoxItemProvider;

	/**
	 * This creates an adapter for a {@link com.abdulaziz.ms.OCV.VContractLoopBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVContractLoopBoxAdapter() {
		if (vContractLoopBoxItemProvider == null) {
			vContractLoopBoxItemProvider = new VContractLoopBoxItemProvider(this);
		}

		return vContractLoopBoxItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (umlClassDiagramItemProvider != null) umlClassDiagramItemProvider.dispose();
		if (umlClassItemProvider != null) umlClassItemProvider.dispose();
		if (umlVariableItemProvider != null) umlVariableItemProvider.dispose();
		if (umlLinkItemProvider != null) umlLinkItemProvider.dispose();
		if (vSystemOperationDiagramItemProvider != null) vSystemOperationDiagramItemProvider.dispose();
		if (vOperationItemProvider != null) vOperationItemProvider.dispose();
		if (vcContractItemProvider != null) vcContractItemProvider.dispose();
		if (vContractPreconditionItemProvider != null) vContractPreconditionItemProvider.dispose();
		if (vContractPostconditionItemProvider != null) vContractPostconditionItemProvider.dispose();
		if (vcLinkItemProvider != null) vcLinkItemProvider.dispose();
		if (vcLinkPrePostConditionItemProvider != null) vcLinkPrePostConditionItemProvider.dispose();
		if (vcValueItemProvider != null) vcValueItemProvider.dispose();
		if (vcEqualityItemProvider != null) vcEqualityItemProvider.dispose();
		if (vcInstanceItemProvider != null) vcInstanceItemProvider.dispose();
		if (vcInstanceFieldItemProvider != null) vcInstanceFieldItemProvider.dispose();
		if (vcAssociationItemProvider != null) vcAssociationItemProvider.dispose();
		if (vcParameterItemProvider != null) vcParameterItemProvider.dispose();
		if (vcOperationBoxItemProvider != null) vcOperationBoxItemProvider.dispose();
		if (vcReturnItemProvider != null) vcReturnItemProvider.dispose();
		if (vcCollectionBoxItemProvider != null) vcCollectionBoxItemProvider.dispose();
		if (vcLoopItemProvider != null) vcLoopItemProvider.dispose();
		if (vcAlternativeBoxItemProvider != null) vcAlternativeBoxItemProvider.dispose();
		if (conditionOptionItemProvider != null) conditionOptionItemProvider.dispose();
		if (vContractAlternativeBoxItemProvider != null) vContractAlternativeBoxItemProvider.dispose();
		if (vContractCollectionBoxItemProvider != null) vContractCollectionBoxItemProvider.dispose();
		if (vContractLoopBoxItemProvider != null) vContractLoopBoxItemProvider.dispose();
	}

}
