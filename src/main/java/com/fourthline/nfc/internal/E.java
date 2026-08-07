package com.fourthline.nfc.internal;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2811f f24520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0 f24521b;

    public E(InterfaceC2811f interfaceC2811f, D0 d11) {
        this.f24520a = interfaceC2811f;
        this.f24521b = d11;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    @Override // com.fourthline.nfc.internal.S
    public InterfaceC2803b a() throws NoSuchAlgorithmException {
        String strG;
        String strD;
        InterfaceC2811f interfaceC2811f = this.f24520a;
        if (interfaceC2811f == null) {
            return null;
        }
        PublicKey publicKeyA = interfaceC2811f.a();
        D0 d11 = this.f24521b;
        if (d11 == null || !(p013kotlin.jvm.internal.s.f(publicKeyA.getAlgorithm(), "EC") || p013kotlin.jvm.internal.s.f(publicKeyA.getAlgorithm(), "ECDSA"))) {
            strG = "SHA1WithRSA/ISO9796-2";
            strD = "SHA1";
        } else {
            List listA = d11.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (obj instanceof br0.f) {
                    arrayList.add(obj);
                }
            }
            br0.f fVar = (br0.f) p013kotlin.collections.v.q0(arrayList);
            if (fVar != null) {
                strG = br0.f.g(fVar.f());
                strD = yq0.o.D(strG);
            } else {
                strG = "SHA1WithRSA/ISO9796-2";
                strD = "SHA1";
            }
        }
        return new C2805c(publicKeyA, strD, strG);
    }

    @Override // com.fourthline.nfc.internal.S
    public List b() {
        D0 d11 = this.f24521b;
        if (d11 == null) {
            return p013kotlin.collections.v.m();
        }
        List listA = d11.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof br0.i) {
                arrayList.add(obj);
            }
        }
        List listA2 = d11.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listA2) {
            if (obj2 instanceof br0.j) {
                arrayList2.add(obj2);
            }
        }
        List<Pair> listV1 = p013kotlin.collections.v.v1(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(listV1, 10));
        for (Pair pair : listV1) {
            br0.i iVar = (br0.i) pair.a();
            br0.j jVar = (br0.j) pair.b();
            BigInteger bigIntegerF = jVar.f();
            String strF = iVar.f();
            p013kotlin.jvm.internal.s.j(strF, "getObjectIdentifier(...)");
            String strG = jVar.g();
            p013kotlin.jvm.internal.s.j(strG, "getObjectIdentifier(...)");
            PublicKey publicKeyH = jVar.h();
            p013kotlin.jvm.internal.s.j(publicKeyH, "getSubjectPublicKey(...)");
            arrayList3.add(new C2823m(bigIntegerF, strF, strG, publicKeyH));
        }
        return arrayList3;
    }
}
