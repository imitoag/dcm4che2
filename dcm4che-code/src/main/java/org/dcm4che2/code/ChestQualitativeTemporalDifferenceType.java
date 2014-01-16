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
 * CID 6134 Chest Qualitative Temporal Difference Type.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ChestQualitativeTemporalDifferenceType {

  /** (M-02530, SRT, "Decrease in size") */
  public static final String DecreaseInSize = "M-02530\\SRT";

  /** (F-05166, SRT, "Difference in border definition") */
  public static final String DifferenceInBorderDefinition = "F-05166\\SRT";

  /** (F-0517E, SRT, "Difference in border shape") */
  public static final String DifferenceInBorderShape = "F-0517E\\SRT";

  /** (F-0516C, SRT, "Difference in distribution") */
  public static final String DifferenceInDistribution = "F-0516C\\SRT";

  /** (F-05170, SRT, "Difference in site involvement") */
  public static final String DifferenceInSiteInvolvement = "F-05170\\SRT";

  /** (F-05167, SRT, "Difference in substance") */
  public static final String DifferenceInSubstance = "F-05167\\SRT";

  /** (F-0516A, SRT, "Difference in Texture") */
  public static final String DifferenceInTexture = "F-0516A\\SRT";

  /** (F-01722, SRT, "Finding partially removed") */
  public static final String FindingPartiallyRemoved = "F-01722\\SRT";

  /** (M-02520, SRT, "Increase in size") */
  public static final String IncreaseInSize = "M-02520\\SRT";

  /** (F-01728, SRT, "Less defined") */
  public static final String LessDefined = "F-01728\\SRT";

  /** (F-01729, SRT, "More defined") */
  public static final String MoreDefined = "F-01729\\SRT";

  /** (F-01723, SRT, "No significant changes in the finding") */
  public static final String NoSignificantChangesInTheFinding = "F-01723\\SRT";
}
