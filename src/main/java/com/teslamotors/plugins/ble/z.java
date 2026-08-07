package com.teslamotors.plugins.ble;

import p013kotlin.Metadata;
import vc0.e3;
import vc0.v2;
import vc0.w2;
import vc0.z2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/teslamotors/plugins/ble/z;", "", "<init>", "()V", "Lvc0/e3;", "unsignedMessage", "Lvc0/z2;", "c", "(Lvc0/e3;)Lvc0/z2;", "Lvc0/w2;", "signedMessage", "b", "(Lvc0/w2;)Lvc0/z2;", "Lvc0/v2;", "signatureType", "", "ciphertext", "tag", "", "iv", "keyID", "a", "(Lvc0/v2;[B[BJ[B)Lvc0/w2;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f57035a = new z();

    private z() {
    }

    public static final w2 a(v2 signatureType, byte[] ciphertext, byte[] tag, long iv2, byte[] keyID) {
        p013kotlin.jvm.internal.s.k(signatureType, "signatureType");
        p013kotlin.jvm.internal.s.k(ciphertext, "ciphertext");
        okio.k.Companion companion = okio.k.INSTANCE;
        w2 w2Var = new w2(null, 0, null, okio.k.Companion.i(companion, ciphertext, 0, 0, 3, null), signatureType, null, null, 103, null);
        return ((signatureType != v2.SIGNATURE_TYPE_AES_GCM && signatureType != v2.SIGNATURE_TYPE_AES_GCM_TOKEN) || keyID == null || tag == null) ? w2Var : w2.b(w2Var, null, (int) iv2, okio.k.Companion.i(companion, keyID, 0, 0, 3, null), null, null, okio.k.Companion.i(companion, tag, 0, 0, 3, null), null, 89, null);
    }

    public static final z2 b(w2 signedMessage) {
        p013kotlin.jvm.internal.s.k(signedMessage, "signedMessage");
        return new z2(signedMessage, null, null, 6, null);
    }

    public static final z2 c(e3 unsignedMessage) {
        p013kotlin.jvm.internal.s.k(unsignedMessage, "unsignedMessage");
        return new z2(null, unsignedMessage, null, 5, null);
    }
}
