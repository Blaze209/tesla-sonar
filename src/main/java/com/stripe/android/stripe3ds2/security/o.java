package com.stripe.android.stripe3ds2.security;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/o;", "Lkz/b;", "", Action.KEY_ATTRIBUTE, "", "counter", "<init>", "([BB)V", "Ljz/l;", "header", "clearText", "Ljz/i;", DateTokenConverter.CONVERTER_KEY, "(Ljz/l;[B)Ljz/i;", "g", "B", "a", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o extends kz.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final byte counter;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/o$a;", "", "<init>", "()V", "", "length", "", "pad", "counter", "", "a", "(IBB)[B", "sdkCounterStoA", "b", "(IB)[B", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53958a = new a();

        private a() {
        }

        private final byte[] a(int length, byte pad, byte counter) {
            int i11 = length / 8;
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, pad);
            bArr[i11 - 1] = counter;
            return bArr;
        }

        public final byte[] b(int length, byte sdkCounterStoA) {
            return a(length, (byte) 0, sdkCounterStoA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(byte[] key, byte b11) {
        super(new SecretKeySpec(key, "AES"));
        s.k(key, "key");
        this.counter = b11;
    }

    @Override // kz.b, jz.k
    public jz.i d(jz.l header, byte[] clearText) throws JOSEException {
        byte[] bArrB;
        nz.f fVarD;
        s.k(header, "header");
        s.k(clearText, "clearText");
        jz.h hVarR = header.r();
        if (!s.f(hVarR, jz.h.f84475l)) {
            throw new JOSEException("Invalid algorithm " + hVarR);
        }
        jz.d dVarT = header.t();
        if (dVarT.b() != yz.e.b(i().getEncoded())) {
            throw new KeyLengthException(dVarT.b(), dVarT);
        }
        if (dVarT.b() != yz.e.b(i().getEncoded())) {
            throw new KeyLengthException("The Content Encryption Key length for " + dVarT + " must be " + dVarT.b() + " bits");
        }
        byte[] bArrA = nz.n.a(header, clearText);
        byte[] bArrA2 = nz.a.a(header);
        if (s.f(header.t(), jz.d.f84444e)) {
            bArrB = a.f53958a.b(128, this.counter);
            fVarD = nz.b.f(i(), bArrB, bArrA, bArrA2, g().d(), g().f());
            s.j(fVarD, "encryptAuthenticated(...)");
        } else {
            if (!s.f(header.t(), jz.d.f84449j)) {
                throw new JOSEException(nz.e.b(header.t(), nz.o.f95509f));
            }
            bArrB = a.f53958a.b(96, this.counter);
            fVarD = nz.c.d(i(), new yz.f(bArrB), bArrA, bArrA2, null);
            s.j(fVarD, "encrypt(...)");
        }
        return new jz.i(header, null, yz.c.e(bArrB), yz.c.e(fVarD.b()), yz.c.e(fVarD.a()));
    }
}
