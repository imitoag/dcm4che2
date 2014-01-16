/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa HealthCare.
 * Portions created by the Initial Developer are Copyright (C) 2010
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4che2.code;

/**
 * CID 4222 Ophthalmic Macular Grid Problem.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class OphthalmicMacularGridProblem {

  /** (F-0123A, SRT, "Constricted Pupil") */
  public static final String ConstrictedPupil = "F-0123A\\SRT";

  /** (DA-75300, SRT, "Corneal Opacity") */
  public static final String CornealOpacity = "DA-75300\\SRT";

  /** (F-F1722, SRT, "Dry Eyes Problem") */
  public static final String DryEyesProblem = "F-F1722\\SRT";

  /** (F-02FA4, SRT, "Eccentric Fixation") */
  public static final String EccentricFixation = "F-02FA4\\SRT";

  /** (110501, DCM, "Equipment failure") */
  public static final String EquipmentFailure = "110501\\DCM";

  /** (DA-76000, SRT, "Eyelid Disease") */
  public static final String EyelidDisease = "DA-76000\\SRT";

  /** (111695, DCM, "Interfering Tears or Drops") */
  public static final String InterferingTearsOrDrops = "111695\\DCM";

  /** (DA-73402, SRT, "Lens Opacity") */
  public static final String LensOpacity = "DA-73402\\SRT";

  /** (110519, DCM, "Operator Error") */
  public static final String OperatorError = "110519\\DCM";

  /** (110518, DCM, "Patient Movement") */
  public static final String PatientMovement = "110518\\DCM";

  /** (111209, DCM, "Patient Positioning Problem") */
  public static final String PatientPositioningProblem = "111209\\DCM";

  /** (R-20839, SRT, "Poor Visual Fixation") */
  public static final String PoorVisualFixation = "R-20839\\SRT";

  /** (DA-74100, SRT, "Refractive Error") */
  public static final String RefractiveError = "DA-74100\\SRT";

  /** (DA-7931D, SRT, "Vitreous Opacity") */
  public static final String VitreousOpacity = "DA-7931D\\SRT";
}
