package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WE implements wn0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkEnvironment f29493a;

    public WE(NetworkEnvironment networkEnvironment) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        this.f29493a = networkEnvironment;
    }

    private final List a(List list) {
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    @Override // wn0.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List invoke(List modules, C3724qF status) throws AbstractC3594nE.e {
        EnumC4118zg workflowStatus;
        Boolean boolValueOf;
        EnumC3319gw status2;
        EnumC3431jh verificationStatus;
        O2 status3;
        p013kotlin.jvm.internal.s.k(modules, "modules");
        p013kotlin.jvm.internal.s.k(status, "status");
        ArrayList arrayList = new ArrayList();
        for (Object obj : modules) {
            WorkflowModule workflowModule = (WorkflowModule) obj;
            String name = workflowModule.getName();
            int iHashCode = name.hashCode();
            if (iHashCode != 100023263) {
                if (iHashCode != 446136192) {
                    if (iHashCode != 1897243161) {
                        if (iHashCode == 1941237996 && name.equals("BankAccountVerification")) {
                            BavStatus bavStatusA = status.a();
                            if (bavStatusA == null || (status3 = bavStatusA.getStatus()) == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(VE.a(status3, p013kotlin.jvm.internal.s.f(p013kotlin.collections.v.A0(modules), workflowModule)));
                            }
                        } else {
                            boolValueOf = Boolean.FALSE;
                        }
                    } else if (name.equals("IdentityVerification")) {
                        IdvStatus idvStatusC = status.c();
                        if (idvStatusC == null || (verificationStatus = idvStatusC.getVerificationStatus()) == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(VE.a(verificationStatus, p013kotlin.jvm.internal.s.f(p013kotlin.collections.v.A0(modules), workflowModule)));
                        }
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                } else if (name.equals("QualifiedElectronicSignature")) {
                    QesStatus qesStatusD = status.d();
                    if (qesStatusD == null || (status2 = qesStatusD.getStatus()) == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(VE.a(status2, p013kotlin.jvm.internal.s.f(p013kotlin.collections.v.A0(modules), workflowModule)));
                    }
                } else {
                    boolValueOf = Boolean.FALSE;
                }
            } else if (name.equals("Workflow")) {
                GenericVerificationStatus genericVerificationStatusB = status.b();
                if (genericVerificationStatusB == null || (workflowStatus = genericVerificationStatusB.getWorkflowStatus()) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(VE.a(workflowStatus, p013kotlin.jvm.internal.s.f(p013kotlin.collections.v.A0(modules), workflowModule)));
                }
            } else {
                boolValueOf = Boolean.FALSE;
            }
            if (boolValueOf == null) {
                throw AbstractC3594nE.e.f33884c;
            }
            if (boolValueOf.booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw AbstractC3594nE.e.f33884c;
        }
        return a(arrayList);
    }
}
