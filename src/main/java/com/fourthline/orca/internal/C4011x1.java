package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 *2\u00020\u0001:\u0002!\u0017B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bBO\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0007\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0011\u0010)\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010(¨\u0006+"}, d2 = {"Lcom/fourthline/orca/internal/x1;", "Lcom/fourthline/orca/internal/Rf;", "Lcom/fourthline/orca/internal/lg;", "bavStrategy", "", "Lcom/fourthline/orca/internal/m2;", "paymentMethods", "<init>", "(Lcom/fourthline/orca/internal/lg;Ljava/util/List;)V", "", "seen0", "", "redirectUrl", "supportedPaymentMethods", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/lg;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/x1;Luo0/d;Lto0/f;)V", ImagesContract.URL, "(Ljava/lang/String;)V", "Lcom/fourthline/orca/internal/u1;", "f", "()Lcom/fourthline/orca/internal/u1;", "Lcom/fourthline/orca/internal/lg;", "c", "()Lcom/fourthline/orca/internal/lg;", "b", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "()Ljava/lang/String;", "redirectUrlWithDeepLink", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final class C4011x1 implements Rf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36636e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f36637f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FlowStrategyConfig bavStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List paymentMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String redirectUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List supportedPaymentMethods;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x1$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f36643b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f36642a = aVar;
            f36643b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.BavFlowConfig", aVar, 4);
            m1Var.o("bavStrategy", true);
            m1Var.o("paymentMethods", false);
            m1Var.o("redirectUrl", true);
            m1Var.o("supportedPaymentMethods", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4011x1 deserialize(uo0.e decoder) {
            int i11;
            FlowStrategyConfig flowStrategyConfig;
            List list;
            String str;
            List list2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = C4011x1.f36637f;
            FlowStrategyConfig flowStrategyConfig2 = null;
            if (cVarB.i()) {
                FlowStrategyConfig flowStrategyConfig3 = (FlowStrategyConfig) cVarB.n(fVar, 0, FlowStrategyConfig.a.f33316a, null);
                List list3 = (List) cVarB.n(fVar, 1, dVarArr[1], null);
                String str2 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, null);
                list2 = (List) cVarB.n(fVar, 3, dVarArr[3], null);
                flowStrategyConfig = flowStrategyConfig3;
                str = str2;
                i11 = 15;
                list = list3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list4 = null;
                String str3 = null;
                List list5 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        flowStrategyConfig2 = (FlowStrategyConfig) cVarB.n(fVar, 0, FlowStrategyConfig.a.f33316a, flowStrategyConfig2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        list4 = (List) cVarB.n(fVar, 1, dVarArr[1], list4);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str3 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, str3);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        list5 = (List) cVarB.n(fVar, 3, dVarArr[3], list5);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                flowStrategyConfig = flowStrategyConfig2;
                list = list4;
                str = str3;
                list2 = list5;
            }
            cVarB.c(fVar);
            return new C4011x1(i11, flowStrategyConfig, list, str, list2, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = C4011x1.f36637f;
            return new ro0.d[]{FlowStrategyConfig.a.f33316a, dVarArr[1], so0.a.p(vo0.z1.f119730a), dVarArr[3]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, C4011x1 value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            C4011x1.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x1$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<C4011x1> serializer() {
            return a.f36642a;
        }

        private Companion() {
        }
    }

    static {
        BavPaymentMethod.a aVar = BavPaymentMethod.a.f33495a;
        f36637f = new ro0.d[]{null, new vo0.e(aVar), null, new vo0.e(aVar)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4011x1(int i11, FlowStrategyConfig flowStrategyConfig, List list, String str, List list2, vo0.v1 v1Var) {
        ArrayList arrayList;
        if (2 != (i11 & 2)) {
            vo0.h1.b(i11, 2, a.f36642a.getDescriptor());
        }
        this.bavStrategy = (i11 & 1) == 0 ? new FlowStrategyConfig((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : flowStrategyConfig;
        this.paymentMethods = list;
        if ((i11 & 4) == 0) {
            this.redirectUrl = null;
        } else {
            this.redirectUrl = str;
        }
        if ((i11 & 8) != 0) {
            this.supportedPaymentMethods = list2;
            return;
        }
        if (Co.f25256a.a()) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BavPaymentMethod) obj).getName() != H2.Manual) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((BavPaymentMethod) obj2).getName() == H2.Online) {
                    arrayList.add(obj2);
                }
            }
        }
        this.supportedPaymentMethods = arrayList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FlowStrategyConfig getBavStrategy() {
        return this.bavStrategy;
    }

    public final String d() {
        return this.redirectUrl + "&redirect=fourthline://orca/bav_status/success&redirectFailure=fourthline://orca/bav_status/failure";
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSupportedPaymentMethods() {
        return this.supportedPaymentMethods;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3881u1 a() {
        return new C3881u1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(C4011x1 self, uo0.d output, to0.f serialDesc) {
        ArrayList arrayList;
        ro0.d[] dVarArr = f36637f;
        int i11 = 1;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.bavStrategy, new FlowStrategyConfig((List) null, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            output.D(serialDesc, 0, FlowStrategyConfig.a.f33316a, self.bavStrategy);
        }
        output.D(serialDesc, 1, dVarArr[1], self.paymentMethods);
        if (output.G(serialDesc, 2) || self.redirectUrl != null) {
            output.y(serialDesc, 2, vo0.z1.f119730a, self.redirectUrl);
        }
        if (!output.G(serialDesc, 3)) {
            List list = self.supportedPaymentMethods;
            if (Co.f25256a.a()) {
                List list2 = self.paymentMethods;
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((BavPaymentMethod) obj).getName() != H2.Manual) {
                        arrayList.add(obj);
                    }
                }
            } else {
                List list3 = self.paymentMethods;
                arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (((BavPaymentMethod) obj2).getName() == H2.Online) {
                        arrayList.add(obj2);
                    }
                }
            }
            if (p013kotlin.jvm.internal.s.f(list, arrayList)) {
                return;
            }
        }
        output.D(serialDesc, 3, dVarArr[3], self.supportedPaymentMethods);
    }

    public C4011x1(FlowStrategyConfig bavStrategy, List paymentMethods) {
        ArrayList arrayList;
        p013kotlin.jvm.internal.s.k(bavStrategy, "bavStrategy");
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        this.bavStrategy = bavStrategy;
        this.paymentMethods = paymentMethods;
        if (Co.f25256a.a()) {
            arrayList = new ArrayList();
            for (Object obj : paymentMethods) {
                if (((BavPaymentMethod) obj).getName() != H2.Manual) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : paymentMethods) {
                if (((BavPaymentMethod) obj2).getName() == H2.Online) {
                    arrayList.add(obj2);
                }
            }
        }
        this.supportedPaymentMethods = arrayList;
    }

    public final void a(String url) {
        this.redirectUrl = url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4011x1(FlowStrategyConfig flowStrategyConfig, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new FlowStrategyConfig((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : flowStrategyConfig, list);
    }
}
