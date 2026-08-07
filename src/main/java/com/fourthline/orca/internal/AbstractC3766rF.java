package com.fourthline.orca.internal;

import java.util.Iterator;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3766rF {
    private static final C3724qF a(WorkflowStatusResponse workflowStatusResponse, wo0.b bVar) {
        BavStatus bavStatus;
        Object next;
        GenericVerificationStatus genericVerificationStatus;
        Object next2;
        IdvStatus idvStatus;
        Object next3;
        QesStatus qesStatus;
        Object next4;
        String onboardingStatus = workflowStatusResponse.getOnboardingStatus();
        Iterator it = workflowStatusResponse.getModuleStatuses().iterator();
        do {
            bavStatus = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((UnparsedModuleStatus) next).getName(), "Workflow"));
        UnparsedModuleStatus unparsedModuleStatus = (UnparsedModuleStatus) next;
        if (unparsedModuleStatus != null) {
            JsonObject value = unparsedModuleStatus.getValue();
            bVar.getSerializersModule();
            genericVerificationStatus = (GenericVerificationStatus) bVar.c(so0.a.p(GenericVerificationStatus.INSTANCE.serializer()), value);
        } else {
            genericVerificationStatus = null;
        }
        Iterator it2 = workflowStatusResponse.getModuleStatuses().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!p013kotlin.jvm.internal.s.f(((UnparsedModuleStatus) next2).getName(), "IdentityVerification"));
        UnparsedModuleStatus unparsedModuleStatus2 = (UnparsedModuleStatus) next2;
        if (unparsedModuleStatus2 != null) {
            JsonObject value2 = unparsedModuleStatus2.getValue();
            bVar.getSerializersModule();
            idvStatus = (IdvStatus) bVar.c(so0.a.p(IdvStatus.INSTANCE.serializer()), value2);
        } else {
            idvStatus = null;
        }
        Iterator it3 = workflowStatusResponse.getModuleStatuses().iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!p013kotlin.jvm.internal.s.f(((UnparsedModuleStatus) next3).getName(), "QualifiedElectronicSignature"));
        UnparsedModuleStatus unparsedModuleStatus3 = (UnparsedModuleStatus) next3;
        if (unparsedModuleStatus3 != null) {
            JsonObject value3 = unparsedModuleStatus3.getValue();
            bVar.getSerializersModule();
            qesStatus = (QesStatus) bVar.c(so0.a.p(QesStatus.INSTANCE.serializer()), value3);
        } else {
            qesStatus = null;
        }
        Iterator it4 = workflowStatusResponse.getModuleStatuses().iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (!p013kotlin.jvm.internal.s.f(((UnparsedModuleStatus) next4).getName(), "BankAccountVerification"));
        UnparsedModuleStatus unparsedModuleStatus4 = (UnparsedModuleStatus) next4;
        if (unparsedModuleStatus4 != null) {
            JsonObject value4 = unparsedModuleStatus4.getValue();
            bVar.getSerializersModule();
            bavStatus = (BavStatus) bVar.c(so0.a.p(BavStatus.INSTANCE.serializer()), value4);
        }
        return new C3724qF(onboardingStatus, genericVerificationStatus, idvStatus, qesStatus, bavStatus);
    }

    public static final C3724qF a(wo0.b bVar, String content) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(content, "content");
        bVar.getSerializersModule();
        return a((WorkflowStatusResponse) bVar.d(WorkflowStatusResponse.INSTANCE.serializer(), content), bVar);
    }
}
