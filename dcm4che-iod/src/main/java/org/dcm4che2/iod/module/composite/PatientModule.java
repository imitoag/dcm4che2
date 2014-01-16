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
 * Java(TM), hosted at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Gunter Zeilinger, Huetteldorferstr. 24/10, 1150 Vienna/Austria/Europe.
 * Portions created by the Initial Developer are Copyright (C) 2002-2005
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * Gunter Zeilinger <gunterze@gmail.com>
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

package org.dcm4che2.iod.module.composite;

import java.util.Date;

import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.data.VR;
import org.dcm4che2.iod.module.Module;
import org.dcm4che2.iod.module.macro.Code;
import org.dcm4che2.iod.module.macro.SOPInstanceReference;

/**
 * @author gunter zeilinger(gunterze@gmail.com)
 * @version $Revision: 739 $ $Date: 2007-01-25 01:09:11 +0100 (Thu, 25 Jan 2007) $
 * @since Jun 9, 2006
 *
 */
public class PatientModule extends Module {

    public PatientModule(DicomObject dcmobj) {
        super(dcmobj);
    }

    public String getPatientName() {
        return dcmobj.getString(Tag.PatientName);
    }
    
    public void setPatientName(String s) {
        dcmobj.putString(Tag.PatientName, VR.PN, s);
    }
    
    public String getPatientID() {
        return dcmobj.getString(Tag.PatientID);
    }
    
    public void setPatientID(String s) {
        dcmobj.putString(Tag.PatientID, VR.LO, s);
    }
    
    public String getIssuerOfPatientID() {
        return dcmobj.getString(Tag.IssuerOfPatientID);
    }
    
    public void setIssuerOfPatientID(String s) {
        dcmobj.putString(Tag.IssuerOfPatientID, VR.LO, s);
    }
    
    public Date getPatientBirthDate() {
        return dcmobj.getDate(Tag.PatientBirthDate);
    }
    
    public void setPatientBirthDate(Date d) {
        dcmobj.putDate(Tag.PatientBirthDate, VR.DA, d);
    }
    
    public Date getPatientBirthTime() {
        return dcmobj.getDate(Tag.PatientBirthTime);
    }
    
    public void setPatientBirthTime(Date d) {
        dcmobj.putDate(Tag.PatientBirthTime, VR.TM, d);
    }
    
    public String getPatientSex() {
        return dcmobj.getString(Tag.PatientSex);
    }
    
    public void setPatientSex(String s) {
        dcmobj.putString(Tag.PatientSex, VR.CS, s);
    }
    
    public SOPInstanceReference getReferencedPatientSOPInstance() {
        DicomObject item = dcmobj.getNestedDicomObject(Tag.ReferencedPatientSequence);
        return item != null ? new SOPInstanceReference(item) : null;
    }
    
    public void setReferencedPatientSOPInstance(SOPInstanceReference refSOP) {
        updateSequence(Tag.ReferencedPatientSequence, refSOP);
    }
    
    public String[] getOtherPatientIDs() {
        return dcmobj.getStrings(Tag.OtherPatientIDs);
    }
    
    public void setOtherPatientIDs(String[] ss) {
        dcmobj.putStrings(Tag.OtherPatientIDs, VR.LO, ss);
    }
    
    public String[] getOtherPatientNames() {
        return dcmobj.getStrings(Tag.OtherPatientNames);
    }
    
    public void setOtherPatientNames(String[] ss) {
        dcmobj.putStrings(Tag.OtherPatientNames, VR.PN, ss);
    }
    
    public String getEthnicGroup() {
        return dcmobj.getString(Tag.EthnicGroup);
    }
    
    public void setEthnicGroup(String s) {
        dcmobj.putString(Tag.EthnicGroup, VR.SH, s);
    }
    
    public String getPatientComments() {
        return dcmobj.getString(Tag.PatientComments);
    }
    
    public void setPatientComments(String s) {
        dcmobj.putString(Tag.PatientComments, VR.LT, s);
    }
    
    public String getPatientIdentifyRemoved() {
        return dcmobj.getString(Tag.PatientIdentityRemoved);
    }
    
    public void setPatientIdentifyRemoved(String s) {
        dcmobj.putString(Tag.PatientIdentityRemoved, VR.CS, s);
    }
    
    public String getDeidentificationMethod() {
        return dcmobj.getString(Tag.DeidentificationMethod);
    }
    
    public void setDeidentificationMethod(String s) {
        dcmobj.putString(Tag.DeidentificationMethod, VR.LO, s);
    }
    
    public Code[] getDeidentificationMethodCodes() {
        return Code.toCodes(dcmobj.get(Tag.DeidentificationMethodCodeSequence));
    }

    public void setDeidentificationMethodCodes(Code[] codes) {
        updateSequence(Tag.DeidentificationMethodCodeSequence, codes);
    }    
}
