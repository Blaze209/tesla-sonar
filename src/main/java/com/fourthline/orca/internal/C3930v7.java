package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3930v7 implements InterfaceC3974w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3974w7 f36024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3974w7 f36025b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v7$a */
    public static final class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mn0.a.d(Integer.valueOf(C3930v7.this.a((AbstractC3641oc) obj2)), Integer.valueOf(C3930v7.this.a((AbstractC3641oc) obj)));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v7$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f36030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f36031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f36032f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f36034h;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36032f = obj;
            this.f36034h |= Integer.MIN_VALUE;
            return C3930v7.this.a(null, null, this);
        }
    }

    public C3930v7(InterfaceC3974w7 countryAndTypeValidator, InterfaceC3974w7 documentSelectionValidator) {
        p013kotlin.jvm.internal.s.k(countryAndTypeValidator, "countryAndTypeValidator");
        p013kotlin.jvm.internal.s.k(documentSelectionValidator, "documentSelectionValidator");
        this.f36024a = countryAndTypeValidator;
        this.f36025b = documentSelectionValidator;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3974w7
    public Object a(C3893uD c3893uD, C3936vD c3936vD, Continuation continuation) {
        b bVar;
        C3930v7 c3930v7;
        C3893uD c3893uD2;
        List list;
        C3936vD c3936vD2;
        List list2;
        List list3;
        C3936vD c3936vD3;
        C3893uD c3893uD3;
        C3930v7 c3930v8;
        DocumentFileSide documentFileSideValueOf;
        C4023xD c4023xDB;
        String strA;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f36034h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f36034h = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objA = bVar.f36032f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f36034h;
        if (i12 == 0) {
            jn0.t.b(objA);
            ArrayList arrayList = new ArrayList();
            InterfaceC3974w7 interfaceC3974w7 = this.f36024a;
            bVar.f36027a = this;
            bVar.f36028b = c3893uD;
            bVar.f36029c = c3936vD;
            bVar.f36030d = arrayList;
            bVar.f36031e = arrayList;
            bVar.f36034h = 1;
            Object objA2 = interfaceC3974w7.a(c3893uD, c3936vD, bVar);
            if (objA2 != coroutine_suspended) {
                c3930v7 = this;
                c3893uD2 = c3893uD;
                list = arrayList;
                objA = objA2;
                c3936vD2 = c3936vD;
                list2 = list;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            list = (List) bVar.f36031e;
            list2 = (List) bVar.f36030d;
            c3936vD2 = (C3936vD) bVar.f36029c;
            c3893uD2 = (C3893uD) bVar.f36028b;
            c3930v7 = (C3930v7) bVar.f36027a;
            jn0.t.b(objA);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list3 = (List) bVar.f36031e;
            list2 = (List) bVar.f36030d;
            c3936vD3 = (C3936vD) bVar.f36029c;
            c3893uD3 = (C3893uD) bVar.f36028b;
            c3930v8 = (C3930v7) bVar.f36027a;
            jn0.t.b(objA);
        }
        list3.addAll((Collection) objA);
        try {
            c4023xDB = c3893uD3.b();
            if (c4023xDB != null || (strA = c4023xDB.a()) == null) {
                documentFileSideValueOf = null;
            } else {
                String upperCase = strA.toUpperCase(Locale.ROOT);
                p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
                documentFileSideValueOf = DocumentFileSide.valueOf(upperCase);
            }
        } catch (Throwable unused) {
        }
        if (documentFileSideValueOf != null) {
            if (documentFileSideValueOf != (c3936vD3 != null ? c3936vD3.b() : null)) {
                list2.add(AbstractC3641oc.b.f34195a);
            }
        }
        return p013kotlin.collections.v.a1(list2, c3930v8.new a());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (Iterable) objA) {
            if (!(((AbstractC3641oc) obj) instanceof AbstractC3641oc.i)) {
                arrayList2.add(obj);
            }
        }
        list.addAll(arrayList2);
        InterfaceC3974w7 interfaceC3974w8 = c3930v7.f36025b;
        bVar.f36027a = c3930v7;
        bVar.f36028b = c3893uD2;
        bVar.f36029c = c3936vD2;
        bVar.f36030d = list2;
        bVar.f36031e = list2;
        bVar.f36034h = 2;
        objA = interfaceC3974w8.a(c3893uD2, c3936vD2, bVar);
        if (objA != coroutine_suspended) {
            list3 = list2;
            c3936vD3 = c3936vD2;
            c3893uD3 = c3893uD2;
            c3930v8 = c3930v7;
            list3.addAll((Collection) objA);
            c4023xDB = c3893uD3.b();
            if (c4023xDB != null) {
                documentFileSideValueOf = null;
            } else {
                documentFileSideValueOf = null;
            }
            if (documentFileSideValueOf != null) {
                if (documentFileSideValueOf != (c3936vD3 != null ? c3936vD3.b() : null)) {
                    list2.add(AbstractC3641oc.b.f34195a);
                }
            }
            return p013kotlin.collections.v.a1(list2, c3930v8.new a());
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(AbstractC3641oc abstractC3641oc) {
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.j.f34203a) || p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.c.f34196a)) {
            return 10;
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.g.f34200a) || p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.f.f34199a)) {
            return 5;
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.e.f34198a)) {
            return 2;
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.d.f34197a) || p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.i.f34202a) || p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.a.f34194a) || p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.b.f34195a)) {
            return 0;
        }
        if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.h.f34201a)) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
