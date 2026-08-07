package com.withpersona.sdk2.inquiry.network.dto;

import defpackage.h;
import defpackage.k;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lh;", "jsonLogicEngine$delegate", "Lkotlin/Lazy;", "getJsonLogicEngine", "()Lh;", "jsonLogicEngine", "network-inquiry_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonLogicBooleanKt {
    private static final Lazy jsonLogicEngine$delegate = m.b(new wn0.a() { // from class: com.withpersona.sdk2.inquiry.network.dto.b
        @Override // wn0.a
        public final Object invoke() {
            return JsonLogicBooleanKt.jsonLogicEngine_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final h getJsonLogicEngine() {
        return (h) jsonLogicEngine$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h jsonLogicEngine_delegate$lambda$0() {
        h.a aVar = new h.a();
        k kVar = k.f84575a;
        return aVar.d(kVar.b()).b(kVar.a()).e();
    }
}
