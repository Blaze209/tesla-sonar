package com.fourthline.core.mrz.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.internal.parsing.mrtd.f;
import com.fourthline.core.mrz.internal.parsing.mrtd.h;
import com.fourthline.core.mrz.internal.parsing.mrtd.j;
import com.fourthline.core.mrz.internal.transformation.e;
import com.fourthline.core.mrz.internal.validation.d;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0464a f24200b = new C0464a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.fourthline.core.mrz.internal.transformation.a f24201a = new com.fourthline.core.mrz.internal.transformation.b();

    /* JADX INFO: renamed from: com.fourthline.core.mrz.internal.a$a, reason: collision with other inner class name */
    private static final class C0464a {
        public /* synthetic */ C0464a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0464a() {
        }
    }

    private enum b {
        MRTD,
        IDL;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24205d = on0.a.a(a());
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.MRTD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.IDL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final com.fourthline.core.mrz.internal.parsing.a a(String str, b bVar) throws com.fourthline.core.mrz.internal.b.a {
        int i11 = c.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (str.length() == 30) {
                return new com.fourthline.core.mrz.internal.parsing.idl.a(str);
            }
            throw com.fourthline.core.mrz.internal.b.a.f24206a;
        }
        int length = str.length();
        if (length == 72) {
            return a(str) ? new com.fourthline.core.mrz.internal.parsing.mrtd.b(str) : new h(str);
        }
        if (length == 88) {
            return new j(str);
        }
        if (length == 90) {
            return new f(str);
        }
        throw com.fourthline.core.mrz.internal.b.a.f24206a;
    }

    public final MrzInfo b(String from) throws com.fourthline.core.mrz.internal.b.C0465b, com.fourthline.core.mrz.internal.b.a {
        b bVar;
        s.k(from, "from");
        String strA = this.f24201a.a(from);
        if (new com.fourthline.core.mrz.internal.validation.mrtd.a(strA).b()) {
            bVar = b.MRTD;
        } else {
            if (!new com.fourthline.core.mrz.internal.validation.idl.a(strA).b()) {
                throw com.fourthline.core.mrz.internal.b.a.f24206a;
            }
            bVar = b.IDL;
        }
        com.fourthline.core.mrz.internal.parsing.a aVarA = a(this.f24201a.b(strA), bVar);
        d dVarB = b(bVar);
        com.fourthline.core.mrz.internal.transformation.d dVarA = a(bVar);
        try {
            com.fourthline.core.mrz.internal.parsing.model.d dVarA2 = aVarA.a();
            return dVarA.a(dVarA2, dVarB.a(dVarA2), strA);
        } catch (Throwable unused) {
            throw com.fourthline.core.mrz.internal.b.C0465b.f24207a;
        }
    }

    private final com.fourthline.core.mrz.internal.transformation.d a(b bVar) {
        int i11 = c.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i11 == 1) {
            return new e();
        }
        if (i11 == 2) {
            return new com.fourthline.core.mrz.internal.transformation.c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final d b(b bVar) {
        int i11 = c.$EnumSwitchMapping$0[bVar.ordinal()];
        com.fourthline.core.mrz.internal.validation.b bVar2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i12 = 1;
        if (i11 != 1) {
            if (i11 == 2) {
                return new com.fourthline.core.mrz.internal.validation.idl.b(bVar2, i12, objArr4 == true ? 1 : 0);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new com.fourthline.core.mrz.internal.validation.mrtd.b(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
    }

    private final boolean a(String str) {
        return s.f(t.n1(str, new bo0.j(0, 4)), "IDFRA");
    }
}
