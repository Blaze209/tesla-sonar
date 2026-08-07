package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Yz implements InterfaceC3645og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29949a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29950a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final CountryNetworkModel f29951b = new CountryNetworkModel("NLD", p013kotlin.collections.v.p(new CountryNetworkModel.Document(DocumentType.PASSPORT, p013kotlin.collections.v.e("NLD"), null, null, 12, null), new CountryNetworkModel.Document(DocumentType.DRIVERS_LICENSE, p013kotlin.collections.v.e("NLD"), null, null, 12, null)));

        private a() {
        }

        public final CountryNetworkModel a() {
            return f29951b;
        }
    }

    public Yz(String validationCode, boolean z11) {
        p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
        String upperCase = (p013kotlin.text.t.y0(validationCode) ? "IDVandQESandBAV" : validationCode).toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        List<String> listF1 = p013kotlin.text.t.f1(upperCase, new String[]{"AND"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : listF1) {
            int iHashCode = str.hashCode();
            if (iHashCode != 65527) {
                if (iHashCode != 72347) {
                    if (iHashCode == 80063 && str.equals("QES")) {
                        arrayList.addAll(c());
                    }
                } else if (str.equals("IDV")) {
                    arrayList.addAll(b());
                }
            } else if (str.equals("BAV")) {
                arrayList.addAll(a());
            }
        }
        if (z11) {
            p013kotlin.collections.v.N(arrayList);
        }
        this.f29949a = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List b() {
        List listD = d();
        char c11 = 1;
        FlowStrategyConfig c3516lg = null;
        CameraX cameraX = null;
        boolean z11 = true;
        DocumentImageCaptureConfig c3932v9 = null;
        DocumentVideoCaptureConfig c2856Dc = null;
        DocumentFlowConfig documentFlowConfig = new DocumentFlowConfig(c3516lg, cameraX, z11, c3932v9, c2856Dc, new DocumentConfirmationConfig(true), new DocumentAnalysisConfig(false, 18, 0L, 0L), new DocumentNfcConfig(true, "Default"), listD, false, 539, null);
        documentFlowConfig.a(VideoDuration.DEFAULT.INSTANCE);
        jn0.h0 h0Var = jn0.h0.f84049a;
        Pair pairA = jn0.x.a("document", documentFlowConfig);
        Pair pairA2 = jn0.x.a("person", new Qp(18));
        Pair pairA3 = jn0.x.a("tin", new C3848tB(MA.NLD, (Boolean) null, (CameraX) null, 4, (DefaultConstructorMarker) null));
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        CameraX cameraX2 = null;
        Pair pairA4 = jn0.x.a("biometrics", new C4006wx(new C4007wy(true, (Integer) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new Ux(true, new Vx(false)), cameraX2, 4, null));
        Pair pairA5 = jn0.x.a("geolocation", new C3605nj());
        EnumEntries enumEntriesD = Tr.d();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(enumEntriesD, 10));
        Iterator<E> it = enumEntriesD.iterator();
        while (it.hasNext()) {
            arrayList.add(new PoaDocumentTypeConfig((Tr) it.next()));
        }
        return p013kotlin.collections.v.p(pairA, pairA2, pairA3, pairA4, pairA5, jn0.x.a("poa", new C3058ar((CameraX) (objArr2 == true ? 1 : 0), (List) arrayList, (int) (c11 == true ? 1 : 0), (DefaultConstructorMarker) (objArr == true ? 1 : 0))), jn0.x.a(PlaceTypes.ADDRESS, new M()), jn0.x.a("contact", new C3200e5()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List c() {
        return p013kotlin.collections.v.e(jn0.x.a("qes", new Zt(new QesSelfieConfig(true, new C4007wy(true, (Integer) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), (CameraX) null, 4, (DefaultConstructorMarker) null), new Ux(true, new Vx(false)), new QesGeolocationConfig(true))));
    }

    private final List d() {
        return p013kotlin.collections.v.e(a.f29950a.a());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3645og
    public Object a(InterfaceC3645og.a aVar, Continuation continuation) {
        Pair pair = (Pair) p013kotlin.collections.v.N(this.f29949a);
        InterfaceC3645og.c dVar = pair != null ? new InterfaceC3645og.c.d((String) pair.e(), (Rf) pair.f()) : InterfaceC3645og.c.b.f34275a;
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(new InterfaceC3645og.b(dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List a() {
        return p013kotlin.collections.v.e(jn0.x.a("bav", new C4011x1(null, p013kotlin.collections.v.e(new BavPaymentMethod(H2.Online, false, 10)), 1, 0 == true ? 1 : 0)));
    }

    public /* synthetic */ Yz(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11);
    }
}
