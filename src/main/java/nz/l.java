package nz;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.IntegerOverflowException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<jz.d> f95505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Set<jz.d>> f95506b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jz.d dVar = jz.d.f84444e;
        linkedHashSet.add(dVar);
        jz.d dVar2 = jz.d.f84445f;
        linkedHashSet.add(dVar2);
        jz.d dVar3 = jz.d.f84446g;
        linkedHashSet.add(dVar3);
        jz.d dVar4 = jz.d.f84449j;
        linkedHashSet.add(dVar4);
        jz.d dVar5 = jz.d.f84450k;
        linkedHashSet.add(dVar5);
        jz.d dVar6 = jz.d.f84451l;
        linkedHashSet.add(dVar6);
        jz.d dVar7 = jz.d.f84447h;
        linkedHashSet.add(dVar7);
        jz.d dVar8 = jz.d.f84448i;
        linkedHashSet.add(dVar8);
        jz.d dVar9 = jz.d.f84452m;
        linkedHashSet.add(dVar9);
        f95505a = Collections.unmodifiableSet(linkedHashSet);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(dVar4);
        hashSet2.add(dVar5);
        hashSet3.add(dVar6);
        hashSet3.add(dVar);
        hashSet3.add(dVar7);
        hashSet3.add(dVar9);
        hashSet4.add(dVar2);
        hashSet5.add(dVar3);
        hashSet5.add(dVar8);
        map.put(128, Collections.unmodifiableSet(hashSet));
        map.put(192, Collections.unmodifiableSet(hashSet2));
        map.put(256, Collections.unmodifiableSet(hashSet3));
        map.put(Integer.valueOf(KyberEngine.KyberPolyBytes), Collections.unmodifiableSet(hashSet4));
        map.put(512, Collections.unmodifiableSet(hashSet5));
        f95506b = Collections.unmodifiableMap(map);
    }

    private static void a(SecretKey secretKey, jz.d dVar) throws KeyLengthException {
        try {
            if (dVar.b() == yz.e.f(secretKey.getEncoded())) {
                return;
            }
            throw new KeyLengthException("The Content Encryption Key (CEK) length for " + dVar + " must be " + dVar.b() + " bits");
        } catch (IntegerOverflowException e11) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e11.getMessage());
        }
    }

    public static byte[] b(jz.l lVar, yz.c cVar, yz.c cVar2, yz.c cVar3, yz.c cVar4, SecretKey secretKey, pz.c cVar5) throws JOSEException {
        jz.l lVar2;
        byte[] bArrC;
        a(secretKey, lVar.t());
        byte[] bArrA = a.a(lVar);
        if (lVar.t().equals(jz.d.f84444e) || lVar.t().equals(jz.d.f84445f) || lVar.t().equals(jz.d.f84446g)) {
            lVar2 = lVar;
            bArrC = b.c(secretKey, cVar2.a(), cVar3.a(), bArrA, cVar4.a(), cVar5.d(), cVar5.f());
        } else if (lVar.t().equals(jz.d.f84449j) || lVar.t().equals(jz.d.f84450k) || lVar.t().equals(jz.d.f84451l)) {
            lVar2 = lVar;
            bArrC = c.c(secretKey, cVar2.a(), cVar3.a(), bArrA, cVar4.a(), cVar5.d());
        } else if (lVar.t().equals(jz.d.f84447h) || lVar.t().equals(jz.d.f84448i)) {
            lVar2 = lVar;
            bArrC = b.d(lVar2, secretKey, cVar, cVar2, cVar3, cVar4, cVar5.d(), cVar5.f());
        } else {
            if (!lVar.t().equals(jz.d.f84452m)) {
                throw new JOSEException(e.b(lVar.t(), f95505a));
            }
            bArrC = c0.a(secretKey, cVar2.a(), cVar3.a(), bArrA, cVar4.a());
            lVar2 = lVar;
        }
        return n.b(lVar2, bArrC);
    }

    public static jz.i c(jz.l lVar, byte[] bArr, SecretKey secretKey, yz.c cVar, pz.c cVar2) throws JOSEException {
        yz.c cVar3;
        f fVarF;
        byte[] bArr2;
        a(secretKey, lVar.t());
        byte[] bArrA = n.a(lVar, bArr);
        byte[] bArrA2 = a.a(lVar);
        if (lVar.t().equals(jz.d.f84444e) || lVar.t().equals(jz.d.f84445f) || lVar.t().equals(jz.d.f84446g)) {
            cVar3 = cVar;
            byte[] bArrH = b.h(cVar2.b());
            fVarF = b.f(secretKey, bArrH, bArrA, bArrA2, cVar2.d(), cVar2.f());
            bArr2 = bArrH;
        } else if (lVar.t().equals(jz.d.f84449j) || lVar.t().equals(jz.d.f84450k) || lVar.t().equals(jz.d.f84451l)) {
            cVar3 = cVar;
            yz.f fVar = new yz.f(c.e(cVar2.b()));
            fVarF = c.d(secretKey, fVar, bArrA, bArrA2, cVar2.d());
            bArr2 = (byte[]) fVar.a();
        } else if (lVar.t().equals(jz.d.f84447h) || lVar.t().equals(jz.d.f84448i)) {
            byte[] bArrH2 = b.h(cVar2.b());
            fVarF = b.g(lVar, secretKey, cVar, bArrH2, bArrA, cVar2.d(), cVar2.f());
            cVar3 = cVar;
            bArr2 = bArrH2;
        } else {
            if (!lVar.t().equals(jz.d.f84452m)) {
                throw new JOSEException(e.b(lVar.t(), f95505a));
            }
            yz.f fVar2 = new yz.f(null);
            fVarF = c0.b(secretKey, fVar2, bArrA, bArrA2);
            bArr2 = (byte[]) fVar2.a();
            cVar3 = cVar;
        }
        return new jz.i(lVar, cVar3, yz.c.e(bArr2), yz.c.e(fVarF.b()), yz.c.e(fVarF.a()));
    }

    public static SecretKey d(jz.d dVar, SecureRandom secureRandom) throws JOSEException {
        Set<jz.d> set = f95505a;
        if (!set.contains(dVar)) {
            throw new JOSEException(e.b(dVar, set));
        }
        byte[] bArr = new byte[yz.e.c(dVar.b())];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
