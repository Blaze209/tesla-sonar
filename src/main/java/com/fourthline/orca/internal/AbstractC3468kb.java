package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Set;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3468kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f32954a = p013kotlin.collections.d1.i(DocumentType.PROOF_OF_ADDRESS, DocumentType.PAPER_ID);

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC3136ck b(DocumentType documentType) {
        return f32954a.contains(documentType) ? EnumC3136ck.PORTRAIT : EnumC3136ck.LANDSCAPE;
    }
}
