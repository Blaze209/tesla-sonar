package com.fourthline.orca.internal;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Lazy;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Wk implements X3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29569d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29570e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f29571f = "NetworkCdnUrlDownloadWorker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Il f29572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3259ff f29573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f29574c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f29578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f29579e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f29581g;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f29579e = obj;
            this.f29581g |= Integer.MIN_VALUE;
            Object objA = Wk.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Wk(Il networkServiceProvider, C3259ff etagSharedPreference) {
        p013kotlin.jvm.internal.s.k(networkServiceProvider, "networkServiceProvider");
        p013kotlin.jvm.internal.s.k(etagSharedPreference, "etagSharedPreference");
        this.f29572a = networkServiceProvider;
        this.f29573b = etagSharedPreference;
        this.f29574c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.bv0
            @Override // wn0.a
            public final Object invoke() {
                return Wk.a(this.f30717a);
            }
        });
    }

    private final Gl a() {
        return (Gl) this.f29574c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gl a(Wk wk2) {
        return (Gl) wk2.f29572a.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.X3
    public Object a(X3.a aVar, Continuation continuation) {
        b bVar;
        File file;
        String strA;
        String str;
        Object value;
        X3.a aVar2;
        Wk wk2;
        Map mapC;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f29581g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f29581g = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f29579e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f29581g;
        if (i12 == 0) {
            jn0.t.b(obj);
            file = new File(aVar.b());
            if (file.isFile() && file.exists()) {
                C3259ff c3259ff = this.f29573b;
                String name = file.getName();
                p013kotlin.jvm.internal.s.j(name, "getName(...)");
                strA = c3259ff.a(name);
            } else {
                strA = null;
            }
            aVar.a();
            aVar.c();
            Gl glA = a();
            Cl.b bVar2 = Cl.b.GET;
            String strC = aVar.c();
            Map mapG = AbstractC3345hf.g();
            Cl.a aVar3 = new Cl.a("workflow_get_assets", bVar2, strC, (strA == null || (mapC = AbstractC3345hf.c(mapG, strA)) == null) ? mapG : mapC, null, null, 48, null);
            bVar.f29575a = this;
            bVar.f29576b = aVar;
            bVar.f29577c = file;
            bVar.f29578d = strA;
            bVar.f29581g = 1;
            Object objA = glA.a(aVar3, bVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = strA;
            value = objA;
            aVar2 = aVar;
            wk2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f29578d;
            file = (File) bVar.f29577c;
            aVar2 = (X3.a) bVar.f29576b;
            wk2 = (Wk) bVar.f29575a;
            jn0.t.b(obj);
            value = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(value);
        if (thE == null) {
            Dl dl2 = (Dl) value;
            if (El.e(dl2)) {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        Boxing.boxBoolean(parentFile.mkdirs());
                    }
                    sn0.h.o(file, El.a(dl2));
                    Map mapB = dl2.b();
                    String lowerCase = bl0.o.f17654a.l().toLowerCase(Locale.ROOT);
                    p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
                    String str2 = (String) mapB.get(lowerCase);
                    if (str2 != null) {
                        C3259ff c3259ff2 = wk2.f29573b;
                        String name2 = file.getName();
                        p013kotlin.jvm.internal.s.j(name2, "getName(...)");
                        c3259ff2.a(name2, str2);
                    }
                    aVar2.a();
                    if (str == null) {
                        String strC2 = aVar2.c();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("DOWNLOADED! ");
                        sb2.append(strC2);
                    }
                    return jn0.s.b(new X3.b.a(false));
                } catch (IOException e11) {
                    String str3 = f29571f;
                    aVar2.a();
                    jn0.g.b(e11);
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    return jn0.s.b(jn0.t.a(new ZD.b(str3 + ".fileWriteError." + aVar2.a())));
                }
            }
            if (dl2.c() == 304) {
                aVar2.a();
                aVar2.c();
                return jn0.s.b(new X3.b.a(true));
            }
            if (El.d(dl2)) {
                return jn0.s.b(jn0.t.a(ZD.c.f30009a));
            }
            String str4 = f29571f;
            aVar2.a();
            aVar2.c();
            return jn0.s.b(jn0.t.a(new ZD.b(str4 + "." + dl2.c() + "." + aVar2.a())));
        }
        return jn0.s.b(jn0.t.a(AbstractC3039aE.a(thE)));
    }
}
