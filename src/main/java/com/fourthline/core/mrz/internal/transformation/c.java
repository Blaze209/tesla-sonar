package com.fourthline.core.mrz.internal.transformation;

import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import java.util.List;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {
    @Override // com.fourthline.core.mrz.internal.transformation.d
    public MrzInfo a(com.fourthline.core.mrz.internal.parsing.model.d parsedMrz, List validationErrors, String rawMrz) {
        s.k(parsedMrz, "parsedMrz");
        s.k(validationErrors, "validationErrors");
        s.k(rawMrz, "rawMrz");
        if (parsedMrz instanceof com.fourthline.core.mrz.internal.parsing.model.b) {
            return new IdlMrzInfo(rawMrz, validationErrors, ((com.fourthline.core.mrz.internal.parsing.model.b) parsedMrz).a());
        }
        throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
    }
}
