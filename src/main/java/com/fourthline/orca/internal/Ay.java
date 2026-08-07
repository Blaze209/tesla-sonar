package com.fourthline.orca.internal;

import java.lang.annotation.Annotation;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/fourthline/orca/internal/Ay;", "", "<init>", "()V", "Lro0/d;", "serializer", "()Lro0/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class Ay {
    public static final Ay INSTANCE = new Ay();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ Lazy f25036a = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: com.fourthline.orca.internal.o00
        @Override // wn0.a
        public final Object invoke() {
            return Ay.a();
        }
    });

    private Ay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ ro0.d a() {
        return new vo0.e1("com.fourthline.orca.core.internal.backend.model.SignSettings", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ ro0.d b() {
        return (ro0.d) f25036a.getValue();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof Ay);
    }

    public int hashCode() {
        return 1114837275;
    }

    public final ro0.d<Ay> serializer() {
        return b();
    }

    public String toString() {
        return "SignSettings";
    }
}
