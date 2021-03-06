/**
 * Copyright (C) 2013 TomTom International B.V.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.genivi.trafficincidentsservice.trafficincidents.trafficincident.DirectCause;
import org.genivi.trafficincidentsservice.trafficincidents.trafficincident.LaneRestrictions;
import org.genivi.trafficincidentsservice.trafficincidents.trafficincident.trafficincidentPackage;
import org.genivi.trafficincidentsservice.trafficincidenttables.WarningLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl.DirectCauseImpl#getWarningLevel <em>Warning Level</em>}</li>
 *   <li>{@link org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl.DirectCauseImpl#isUnverifiedInformation <em>Unverified Information</em>}</li>
 *   <li>{@link org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl.DirectCauseImpl#getSubCause <em>Sub Cause</em>}</li>
 *   <li>{@link org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl.DirectCauseImpl#getLengthAffected <em>Length Affected</em>}</li>
 *   <li>{@link org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl.DirectCauseImpl#getLaneRestrictions <em>Lane Restrictions</em>}</li>
 *   <li>{@link org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl.DirectCauseImpl#getFreeText <em>Free Text</em>}</li>
 *   <li>{@link org.genivi.trafficincidentsservice.trafficincidents.trafficincident.impl.DirectCauseImpl#getCauseOffset <em>Cause Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectCauseImpl extends CauseImpl implements DirectCause {
  /**
	 * The default value of the '{@link #getWarningLevel() <em>Warning Level</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWarningLevel()
	 * @generated
	 * @ordered
	 */
  protected static final WarningLevel WARNING_LEVEL_EDEFAULT = WarningLevel.INFORMATIVE;

  /**
	 * The cached value of the '{@link #getWarningLevel() <em>Warning Level</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWarningLevel()
	 * @generated
	 * @ordered
	 */
  protected WarningLevel warningLevel = WARNING_LEVEL_EDEFAULT;

  /**
	 * This is true if the Warning Level attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean warningLevelESet;

  /**
	 * The default value of the '{@link #isUnverifiedInformation() <em>Unverified Information</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isUnverifiedInformation()
	 * @generated
	 * @ordered
	 */
  protected static final boolean UNVERIFIED_INFORMATION_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isUnverifiedInformation() <em>Unverified Information</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isUnverifiedInformation()
	 * @generated
	 * @ordered
	 */
  protected boolean unverifiedInformation = UNVERIFIED_INFORMATION_EDEFAULT;

  /**
	 * This is true if the Unverified Information attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean unverifiedInformationESet;

  /**
	 * The default value of the '{@link #getSubCause() <em>Sub Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubCause()
	 * @generated
	 * @ordered
	 */
  protected static final Object SUB_CAUSE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSubCause() <em>Sub Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubCause()
	 * @generated
	 * @ordered
	 */
  protected Object subCause = SUB_CAUSE_EDEFAULT;

  /**
	 * This is true if the Sub Cause attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean subCauseESet;

  /**
	 * The default value of the '{@link #getLengthAffected() <em>Length Affected</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLengthAffected()
	 * @generated
	 * @ordered
	 */
  protected static final Integer LENGTH_AFFECTED_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLengthAffected() <em>Length Affected</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLengthAffected()
	 * @generated
	 * @ordered
	 */
  protected Integer lengthAffected = LENGTH_AFFECTED_EDEFAULT;

  /**
	 * This is true if the Length Affected attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean lengthAffectedESet;

  /**
	 * The cached value of the '{@link #getLaneRestrictions() <em>Lane Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLaneRestrictions()
	 * @generated
	 * @ordered
	 */
  protected LaneRestrictions laneRestrictions;

  /**
	 * This is true if the Lane Restrictions containment reference has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean laneRestrictionsESet;

  /**
	 * The default value of the '{@link #getFreeText() <em>Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFreeText()
	 * @generated
	 * @ordered
	 */
  protected static final String FREE_TEXT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFreeText() <em>Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFreeText()
	 * @generated
	 * @ordered
	 */
  protected String freeText = FREE_TEXT_EDEFAULT;

  /**
	 * This is true if the Free Text attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean freeTextESet;

  /**
	 * The default value of the '{@link #getCauseOffset() <em>Cause Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CAUSE_OFFSET_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getCauseOffset() <em>Cause Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer causeOffset = CAUSE_OFFSET_EDEFAULT;

		/**
	 * This is true if the Cause Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean causeOffsetESet;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DirectCauseImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return trafficincidentPackage.Literals.DIRECT_CAUSE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WarningLevel getWarningLevel() {
		return warningLevel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWarningLevel(WarningLevel newWarningLevel) {
		WarningLevel oldWarningLevel = warningLevel;
		warningLevel = newWarningLevel == null ? WARNING_LEVEL_EDEFAULT : newWarningLevel;
		boolean oldWarningLevelESet = warningLevelESet;
		warningLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__WARNING_LEVEL, oldWarningLevel, warningLevel, !oldWarningLevelESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetWarningLevel() {
		WarningLevel oldWarningLevel = warningLevel;
		boolean oldWarningLevelESet = warningLevelESet;
		warningLevel = WARNING_LEVEL_EDEFAULT;
		warningLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__WARNING_LEVEL, oldWarningLevel, WARNING_LEVEL_EDEFAULT, oldWarningLevelESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetWarningLevel() {
		return warningLevelESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isUnverifiedInformation() {
		return unverifiedInformation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUnverifiedInformation(boolean newUnverifiedInformation) {
		boolean oldUnverifiedInformation = unverifiedInformation;
		unverifiedInformation = newUnverifiedInformation;
		boolean oldUnverifiedInformationESet = unverifiedInformationESet;
		unverifiedInformationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__UNVERIFIED_INFORMATION, oldUnverifiedInformation, unverifiedInformation, !oldUnverifiedInformationESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetUnverifiedInformation() {
		boolean oldUnverifiedInformation = unverifiedInformation;
		boolean oldUnverifiedInformationESet = unverifiedInformationESet;
		unverifiedInformation = UNVERIFIED_INFORMATION_EDEFAULT;
		unverifiedInformationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__UNVERIFIED_INFORMATION, oldUnverifiedInformation, UNVERIFIED_INFORMATION_EDEFAULT, oldUnverifiedInformationESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetUnverifiedInformation() {
		return unverifiedInformationESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object getSubCause() {
		return subCause;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSubCause(Object newSubCause) {
		Object oldSubCause = subCause;
		subCause = newSubCause;
		boolean oldSubCauseESet = subCauseESet;
		subCauseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__SUB_CAUSE, oldSubCause, subCause, !oldSubCauseESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetSubCause() {
		Object oldSubCause = subCause;
		boolean oldSubCauseESet = subCauseESet;
		subCause = SUB_CAUSE_EDEFAULT;
		subCauseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__SUB_CAUSE, oldSubCause, SUB_CAUSE_EDEFAULT, oldSubCauseESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetSubCause() {
		return subCauseESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Integer getLengthAffected() {
		return lengthAffected;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLengthAffected(Integer newLengthAffected) {
		Integer oldLengthAffected = lengthAffected;
		lengthAffected = newLengthAffected;
		boolean oldLengthAffectedESet = lengthAffectedESet;
		lengthAffectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__LENGTH_AFFECTED, oldLengthAffected, lengthAffected, !oldLengthAffectedESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetLengthAffected() {
		Integer oldLengthAffected = lengthAffected;
		boolean oldLengthAffectedESet = lengthAffectedESet;
		lengthAffected = LENGTH_AFFECTED_EDEFAULT;
		lengthAffectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__LENGTH_AFFECTED, oldLengthAffected, LENGTH_AFFECTED_EDEFAULT, oldLengthAffectedESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetLengthAffected() {
		return lengthAffectedESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LaneRestrictions getLaneRestrictions() {
		return laneRestrictions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLaneRestrictions(LaneRestrictions newLaneRestrictions, NotificationChain msgs) {
		LaneRestrictions oldLaneRestrictions = laneRestrictions;
		laneRestrictions = newLaneRestrictions;
		boolean oldLaneRestrictionsESet = laneRestrictionsESet;
		laneRestrictionsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS, oldLaneRestrictions, newLaneRestrictions, !oldLaneRestrictionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLaneRestrictions(LaneRestrictions newLaneRestrictions) {
		if (newLaneRestrictions != laneRestrictions) {
			NotificationChain msgs = null;
			if (laneRestrictions != null)
				msgs = ((InternalEObject)laneRestrictions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS, null, msgs);
			if (newLaneRestrictions != null)
				msgs = ((InternalEObject)newLaneRestrictions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS, null, msgs);
			msgs = basicSetLaneRestrictions(newLaneRestrictions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLaneRestrictionsESet = laneRestrictionsESet;
			laneRestrictionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS, newLaneRestrictions, newLaneRestrictions, !oldLaneRestrictionsESet));
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicUnsetLaneRestrictions(NotificationChain msgs) {
		LaneRestrictions oldLaneRestrictions = laneRestrictions;
		laneRestrictions = null;
		boolean oldLaneRestrictionsESet = laneRestrictionsESet;
		laneRestrictionsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS, oldLaneRestrictions, null, oldLaneRestrictionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetLaneRestrictions() {
		if (laneRestrictions != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)laneRestrictions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS, null, msgs);
			msgs = basicUnsetLaneRestrictions(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLaneRestrictionsESet = laneRestrictionsESet;
			laneRestrictionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS, null, null, oldLaneRestrictionsESet));
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetLaneRestrictions() {
		return laneRestrictionsESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFreeText() {
		return freeText;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFreeText(String newFreeText) {
		String oldFreeText = freeText;
		freeText = newFreeText;
		boolean oldFreeTextESet = freeTextESet;
		freeTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__FREE_TEXT, oldFreeText, freeText, !oldFreeTextESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetFreeText() {
		String oldFreeText = freeText;
		boolean oldFreeTextESet = freeTextESet;
		freeText = FREE_TEXT_EDEFAULT;
		freeTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__FREE_TEXT, oldFreeText, FREE_TEXT_EDEFAULT, oldFreeTextESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetFreeText() {
		return freeTextESet;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCauseOffset() {
		return causeOffset;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCauseOffset(Integer newCauseOffset) {
		Integer oldCauseOffset = causeOffset;
		causeOffset = newCauseOffset;
		boolean oldCauseOffsetESet = causeOffsetESet;
		causeOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, trafficincidentPackage.DIRECT_CAUSE__CAUSE_OFFSET, oldCauseOffset, causeOffset, !oldCauseOffsetESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCauseOffset() {
		Integer oldCauseOffset = causeOffset;
		boolean oldCauseOffsetESet = causeOffsetESet;
		causeOffset = CAUSE_OFFSET_EDEFAULT;
		causeOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, trafficincidentPackage.DIRECT_CAUSE__CAUSE_OFFSET, oldCauseOffset, CAUSE_OFFSET_EDEFAULT, oldCauseOffsetESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCauseOffset() {
		return causeOffsetESet;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS:
				return basicUnsetLaneRestrictions(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case trafficincidentPackage.DIRECT_CAUSE__WARNING_LEVEL:
				return getWarningLevel();
			case trafficincidentPackage.DIRECT_CAUSE__UNVERIFIED_INFORMATION:
				return isUnverifiedInformation();
			case trafficincidentPackage.DIRECT_CAUSE__SUB_CAUSE:
				return getSubCause();
			case trafficincidentPackage.DIRECT_CAUSE__LENGTH_AFFECTED:
				return getLengthAffected();
			case trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS:
				return getLaneRestrictions();
			case trafficincidentPackage.DIRECT_CAUSE__FREE_TEXT:
				return getFreeText();
			case trafficincidentPackage.DIRECT_CAUSE__CAUSE_OFFSET:
				return getCauseOffset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case trafficincidentPackage.DIRECT_CAUSE__WARNING_LEVEL:
				setWarningLevel((WarningLevel)newValue);
				return;
			case trafficincidentPackage.DIRECT_CAUSE__UNVERIFIED_INFORMATION:
				setUnverifiedInformation((Boolean)newValue);
				return;
			case trafficincidentPackage.DIRECT_CAUSE__SUB_CAUSE:
				setSubCause(newValue);
				return;
			case trafficincidentPackage.DIRECT_CAUSE__LENGTH_AFFECTED:
				setLengthAffected((Integer)newValue);
				return;
			case trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS:
				setLaneRestrictions((LaneRestrictions)newValue);
				return;
			case trafficincidentPackage.DIRECT_CAUSE__FREE_TEXT:
				setFreeText((String)newValue);
				return;
			case trafficincidentPackage.DIRECT_CAUSE__CAUSE_OFFSET:
				setCauseOffset((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID) {
		switch (featureID) {
			case trafficincidentPackage.DIRECT_CAUSE__WARNING_LEVEL:
				unsetWarningLevel();
				return;
			case trafficincidentPackage.DIRECT_CAUSE__UNVERIFIED_INFORMATION:
				unsetUnverifiedInformation();
				return;
			case trafficincidentPackage.DIRECT_CAUSE__SUB_CAUSE:
				unsetSubCause();
				return;
			case trafficincidentPackage.DIRECT_CAUSE__LENGTH_AFFECTED:
				unsetLengthAffected();
				return;
			case trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS:
				unsetLaneRestrictions();
				return;
			case trafficincidentPackage.DIRECT_CAUSE__FREE_TEXT:
				unsetFreeText();
				return;
			case trafficincidentPackage.DIRECT_CAUSE__CAUSE_OFFSET:
				unsetCauseOffset();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case trafficincidentPackage.DIRECT_CAUSE__WARNING_LEVEL:
				return isSetWarningLevel();
			case trafficincidentPackage.DIRECT_CAUSE__UNVERIFIED_INFORMATION:
				return isSetUnverifiedInformation();
			case trafficincidentPackage.DIRECT_CAUSE__SUB_CAUSE:
				return isSetSubCause();
			case trafficincidentPackage.DIRECT_CAUSE__LENGTH_AFFECTED:
				return isSetLengthAffected();
			case trafficincidentPackage.DIRECT_CAUSE__LANE_RESTRICTIONS:
				return isSetLaneRestrictions();
			case trafficincidentPackage.DIRECT_CAUSE__FREE_TEXT:
				return isSetFreeText();
			case trafficincidentPackage.DIRECT_CAUSE__CAUSE_OFFSET:
				return isSetCauseOffset();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (warningLevel: ");
		if (warningLevelESet) result.append(warningLevel); else result.append("<unset>");
		result.append(", unverifiedInformation: ");
		if (unverifiedInformationESet) result.append(unverifiedInformation); else result.append("<unset>");
		result.append(", subCause: ");
		if (subCauseESet) result.append(subCause); else result.append("<unset>");
		result.append(", lengthAffected: ");
		if (lengthAffectedESet) result.append(lengthAffected); else result.append("<unset>");
		result.append(", freeText: ");
		if (freeTextESet) result.append(freeText); else result.append("<unset>");
		result.append(", causeOffset: ");
		if (causeOffsetESet) result.append(causeOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DirectCauseImpl
