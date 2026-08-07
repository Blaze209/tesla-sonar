package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerStep;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3324h0 implements InterfaceC3921uz {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32139h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f32140i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3889u9 f32141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3837t0 f32142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3408j0 f32143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3974w7 f32144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4044xs f32145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2974Vb f32146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ez f32147g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h0$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f32151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f32152e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32154g;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32152e = obj;
            this.f32154g |= Integer.MIN_VALUE;
            return C3324h0.this.a((C3640ob) null, (Gz) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h0$c */
    /* synthetic */ class c extends p013kotlin.jvm.internal.a implements wn0.a {
        c(Object obj) {
            super(0, obj, C3640ob.class, "nextStep", "nextStep$fourthline_sdk_release()Lkotlinx/coroutines/Job;", 8);
        }

        public final void a() {
            ((C3640ob) this.receiver).m();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h0$d */
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f32158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f32159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f32160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f32161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f32162h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f32164j;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32162h = obj;
            this.f32164j |= Integer.MIN_VALUE;
            return C3324h0.this.a((C3640ob) null, (Gz) null, (String) null, (DocumentRecognitionData) null, this);
        }
    }

    public C3324h0(C3889u9 identifierRepository, InterfaceC3837t0 analyzeImageWorker, InterfaceC3408j0 repository, InterfaceC3974w7 validator, InterfaceC4044xs popupHandler, C2974Vb analytics) {
        p013kotlin.jvm.internal.s.k(identifierRepository, "identifierRepository");
        p013kotlin.jvm.internal.s.k(analyzeImageWorker, "analyzeImageWorker");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(validator, "validator");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f32141a = identifierRepository;
        this.f32142b = analyzeImageWorker;
        this.f32143c = repository;
        this.f32144d = validator;
        this.f32145e = popupHandler;
        this.f32146f = analytics;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    public void reset() {
        InterfaceC3921uz.a.a(this);
    }

    private final Object b(DocumentRecognitionData documentRecognitionData, Continuation continuation) {
        String error = documentRecognitionData.getError();
        if (p013kotlin.jvm.internal.s.f(error, "DocumentNotSupported")) {
            return p013kotlin.collections.v.e(AbstractC3641oc.e.f34198a);
        }
        return p013kotlin.jvm.internal.s.f(error, "NoDocumentDetected") ? p013kotlin.collections.v.e(AbstractC3641oc.c.f34196a) : p013kotlin.collections.v.m();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:55:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0172  */
    /* JADX WARN: Code duplicated, block: B:59:0x0184  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        if (r1 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014e, code lost:
    
        if (r1 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019f, code lost:
    
        if (r1 == r2) goto L63;
     */
    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.C3640ob r19, com.fourthline.orca.internal.Gz r20, p013kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3324h0.a(com.fourthline.orca.internal.ob, com.fourthline.orca.internal.Gz, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0109  */
    /* JADX WARN: Code duplicated, block: B:36:0x012a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Code duplicated, block: B:49:0x0162 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(C3640ob c3640ob, Gz gz2, String str, DocumentRecognitionData documentRecognitionData, Continuation continuation) {
        d dVar;
        C3936vD c3936vDB;
        Object objA;
        C3324h0 c3324h0;
        C3640ob c3640ob2;
        Collection collection;
        Gz gz3;
        C3936vD c3936vD;
        String str2;
        DocumentRecognitionData documentRecognitionData2;
        Collection collectionP0;
        String str3;
        C3640ob c3640ob3;
        Gz gz4;
        C3324h0 c3324h1;
        Iterator it;
        Object next;
        AbstractC3641oc abstractC3641oc;
        DocumentRecognitionData documentRecognitionData3;
        InterfaceC3921uz.b bVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f32164j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f32164j = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object objA2 = dVar2.f32162h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar2.f32164j;
        if (i12 == 0) {
            jn0.t.b(objA2);
            c3936vDB = AbstractC3367i0.b(gz2);
            dVar2.f32155a = this;
            dVar2.f32156b = c3640ob;
            dVar2.f32157c = gz2;
            dVar2.f32158d = str;
            dVar2.f32159e = documentRecognitionData;
            dVar2.f32160f = c3936vDB;
            dVar2.f32164j = 1;
            objA = a(documentRecognitionData, dVar2);
            if (objA != coroutine_suspended) {
                c3324h0 = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            C3936vD c3936vD2 = (C3936vD) dVar2.f32160f;
            documentRecognitionData = (DocumentRecognitionData) dVar2.f32159e;
            str = (String) dVar2.f32158d;
            gz2 = (Gz) dVar2.f32157c;
            C3640ob c3640ob4 = (C3640ob) dVar2.f32156b;
            c3324h0 = (C3324h0) dVar2.f32155a;
            jn0.t.b(objA2);
            c3936vDB = c3936vD2;
            c3640ob = c3640ob4;
            objA = objA2;
        } else {
            if (i12 == 2) {
                collection = (Collection) dVar2.f32161g;
                c3936vD = (C3936vD) dVar2.f32160f;
                documentRecognitionData2 = (DocumentRecognitionData) dVar2.f32159e;
                str2 = (String) dVar2.f32158d;
                gz3 = (Gz) dVar2.f32157c;
                c3640ob2 = (C3640ob) dVar2.f32156b;
                c3324h0 = (C3324h0) dVar2.f32155a;
                jn0.t.b(objA2);
                collectionP0 = p013kotlin.collections.v.P0(collection, (Iterable) objA2);
                dVar2.f32155a = c3324h0;
                dVar2.f32156b = c3640ob2;
                dVar2.f32157c = gz3;
                dVar2.f32158d = str2;
                dVar2.f32159e = documentRecognitionData2;
                dVar2.f32160f = c3936vD;
                dVar2.f32161g = collectionP0;
                dVar2.f32164j = 3;
                objA2 = c3324h0.a(documentRecognitionData2, c3936vD, dVar2);
                if (objA2 != coroutine_suspended) {
                    C3640ob c3640ob5 = c3640ob2;
                    str3 = str2;
                    c3640ob3 = c3640ob5;
                    gz4 = gz3;
                    c3324h1 = c3324h0;
                    List listP0 = p013kotlin.collections.v.P0(collectionP0, (Iterable) objA2);
                    c3324h1.f32146f.track(new C2974Vb.a.c(documentRecognitionData2, c3936vD, listP0));
                    it = listP0.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!c3324h1.f32143c.d().a((AbstractC3641oc) next));
                    abstractC3641oc = (AbstractC3641oc) next;
                    if (abstractC3641oc != null) {
                        dVar2.f32155a = documentRecognitionData2;
                        dVar2.f32156b = null;
                        dVar2.f32157c = null;
                        dVar2.f32158d = null;
                        dVar2.f32159e = null;
                        dVar2.f32160f = null;
                        dVar2.f32161g = null;
                        dVar2.f32164j = 4;
                        objA2 = c3324h1.a(c3640ob3, gz4, str3, abstractC3641oc, dVar2);
                        if (objA2 != coroutine_suspended) {
                            documentRecognitionData3 = documentRecognitionData2;
                        }
                    }
                    InterfaceC3921uz.b bVar2 = InterfaceC3921uz.b.MoveToTheNextStep;
                    bVar2.a(documentRecognitionData2.getValue());
                    return bVar2;
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                collectionP0 = (Collection) dVar2.f32161g;
                c3936vD = (C3936vD) dVar2.f32160f;
                documentRecognitionData2 = (DocumentRecognitionData) dVar2.f32159e;
                String str4 = (String) dVar2.f32158d;
                Gz gz5 = (Gz) dVar2.f32157c;
                C3640ob c3640ob6 = (C3640ob) dVar2.f32156b;
                C3324h0 c3324h2 = (C3324h0) dVar2.f32155a;
                jn0.t.b(objA2);
                str3 = str4;
                c3640ob3 = c3640ob6;
                gz4 = gz5;
                c3324h1 = c3324h2;
                List listP1 = p013kotlin.collections.v.P0(collectionP0, (Iterable) objA2);
                c3324h1.f32146f.track(new C2974Vb.a.c(documentRecognitionData2, c3936vD, listP1));
                it = listP1.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!c3324h1.f32143c.d().a((AbstractC3641oc) next));
                abstractC3641oc = (AbstractC3641oc) next;
                if (abstractC3641oc != null) {
                    dVar2.f32155a = documentRecognitionData2;
                    dVar2.f32156b = null;
                    dVar2.f32157c = null;
                    dVar2.f32158d = null;
                    dVar2.f32159e = null;
                    dVar2.f32160f = null;
                    dVar2.f32161g = null;
                    dVar2.f32164j = 4;
                    objA2 = c3324h1.a(c3640ob3, gz4, str3, abstractC3641oc, dVar2);
                    if (objA2 != coroutine_suspended) {
                        documentRecognitionData3 = documentRecognitionData2;
                    }
                    return coroutine_suspended;
                }
                InterfaceC3921uz.b bVar3 = InterfaceC3921uz.b.MoveToTheNextStep;
                bVar3.a(documentRecognitionData2.getValue());
                return bVar3;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            documentRecognitionData3 = (DocumentRecognitionData) dVar2.f32155a;
            jn0.t.b(objA2);
        }
        bVar = (InterfaceC3921uz.b) objA2;
        if (bVar == null) {
            return bVar;
        }
        documentRecognitionData2 = documentRecognitionData3;
        InterfaceC3921uz.b bVar4 = InterfaceC3921uz.b.MoveToTheNextStep;
        bVar4.a(documentRecognitionData2.getValue());
        return bVar4;
        Collection collection2 = (Collection) objA;
        dVar2.f32155a = c3324h0;
        dVar2.f32156b = c3640ob;
        dVar2.f32157c = gz2;
        dVar2.f32158d = str;
        dVar2.f32159e = documentRecognitionData;
        dVar2.f32160f = c3936vDB;
        dVar2.f32161g = collection2;
        dVar2.f32164j = 2;
        Object objB = c3324h0.b(documentRecognitionData, dVar2);
        if (objB != coroutine_suspended) {
            c3640ob2 = c3640ob;
            collection = collection2;
            gz3 = gz2;
            c3936vD = c3936vDB;
            objA2 = objB;
            DocumentRecognitionData documentRecognitionData4 = documentRecognitionData;
            str2 = str;
            documentRecognitionData2 = documentRecognitionData4;
            collectionP0 = p013kotlin.collections.v.P0(collection, (Iterable) objA2);
            dVar2.f32155a = c3324h0;
            dVar2.f32156b = c3640ob2;
            dVar2.f32157c = gz3;
            dVar2.f32158d = str2;
            dVar2.f32159e = documentRecognitionData2;
            dVar2.f32160f = c3936vD;
            dVar2.f32161g = collectionP0;
            dVar2.f32164j = 3;
            objA2 = c3324h0.a(documentRecognitionData2, c3936vD, dVar2);
            if (objA2 != coroutine_suspended) {
                C3640ob c3640ob7 = c3640ob2;
                str3 = str2;
                c3640ob3 = c3640ob7;
                gz4 = gz3;
                c3324h1 = c3324h0;
                List listP2 = p013kotlin.collections.v.P0(collectionP0, (Iterable) objA2);
                c3324h1.f32146f.track(new C2974Vb.a.c(documentRecognitionData2, c3936vD, listP2));
                it = listP2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!c3324h1.f32143c.d().a((AbstractC3641oc) next));
                abstractC3641oc = (AbstractC3641oc) next;
                if (abstractC3641oc != null) {
                    dVar2.f32155a = documentRecognitionData2;
                    dVar2.f32156b = null;
                    dVar2.f32157c = null;
                    dVar2.f32158d = null;
                    dVar2.f32159e = null;
                    dVar2.f32160f = null;
                    dVar2.f32161g = null;
                    dVar2.f32164j = 4;
                    objA2 = c3324h1.a(c3640ob3, gz4, str3, abstractC3641oc, dVar2);
                    if (objA2 != coroutine_suspended) {
                        documentRecognitionData3 = documentRecognitionData2;
                        bVar = (InterfaceC3921uz.b) objA2;
                        if (bVar == null) {
                            return bVar;
                        }
                        documentRecognitionData2 = documentRecognitionData3;
                    }
                }
                InterfaceC3921uz.b bVar5 = InterfaceC3921uz.b.MoveToTheNextStep;
                bVar5.a(documentRecognitionData2.getValue());
                return bVar5;
            }
        }
        return coroutine_suspended;
    }

    private final Object a(C3640ob c3640ob, Gz gz2, String str, AbstractC3641oc abstractC3641oc, Continuation continuation) {
        if (!p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.b.f34195a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.c.f34196a)) {
            if (p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.h.f34201a)) {
                c3640ob.z();
                this.f32145e.a(new Ds.c(abstractC3641oc, "document_scanner", null, 4, null));
                return InterfaceC3921uz.b.HandledInternally;
            }
            if (!p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.f.f34199a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.g.f34200a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.d.f34197a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.e.f34198a)) {
                if (!p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.a.f34194a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.i.f34202a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.j.f34203a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c3640ob.i().a(c3640ob.k().e(false));
                c3640ob.z();
                this.f32145e.a(new Ds.c(abstractC3641oc, "document_scanner", null, 4, null));
                return InterfaceC3921uz.b.HandledInternally;
            }
            c3640ob.z();
            InterfaceC4044xs.a.a(this.f32145e, new Ds.c(abstractC3641oc, "document_scanner", null, 4, null), null, new c(c3640ob), 2, null);
            return InterfaceC3921uz.b.HandledInternally;
        }
        return a(c3640ob, gz2, str, abstractC3641oc);
    }

    private final InterfaceC3921uz.b a(final C3640ob c3640ob, final Gz gz2, final String str, final AbstractC3641oc abstractC3641oc) {
        Set setA;
        Ez ez2 = this.f32147g;
        if (ez2 != null && (setA = ez2.a()) != null && setA.contains(abstractC3641oc)) {
            Ez ez3 = this.f32147g;
            if (p013kotlin.jvm.internal.s.f(ez3 != null ? ez3.c() : null, AbstractC3367i0.b(gz2.c()))) {
                this.f32146f.track(new C2974Vb.a.d(abstractC3641oc, AbstractC3367i0.b(gz2)));
                return InterfaceC3921uz.b.MoveToTheNextStep;
            }
        }
        c3640ob.i().a(c3640ob.k().e(false));
        this.f32145e.a(new Ds.c(abstractC3641oc, "document_scanner", new wn0.a() { // from class: com.fourthline.orca.internal.q21
            @Override // wn0.a
            public final Object invoke() {
                return C3324h0.a(this.f34708a, str, gz2, abstractC3641oc, c3640ob);
            }
        }));
        return InterfaceC3921uz.b.HandledInternally;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3324h0 c3324h0, String str, Gz gz2, AbstractC3641oc abstractC3641oc, C3640ob c3640ob) {
        Set setC;
        Set setA;
        C3798s4 c3798s4B = AbstractC3367i0.b(gz2.c());
        Ez ez2 = c3324h0.f32147g;
        if (ez2 == null || (setA = ez2.a()) == null || (setC = p013kotlin.collections.d1.o(setA, abstractC3641oc)) == null) {
            setC = p013kotlin.collections.d1.c(abstractC3641oc);
        }
        c3324h0.f32147g = new Ez(str, c3798s4B, setC);
        c3640ob.C();
        return jn0.h0.f84049a;
    }

    private final Object a(DocumentRecognitionData documentRecognitionData, C3936vD c3936vD, Continuation continuation) {
        return this.f32144d.a(AbstractC3367i0.b(documentRecognitionData), c3936vD, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if ((r2 != null ? r2.c() : null) == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(com.fourthline.orca.internal.DocumentRecognitionData r2, p013kotlin.coroutines.Continuation r3) {
        /*
            r1 = this;
            com.fourthline.orca.internal.j0 r3 = r1.f32143c
            boolean r3 = r3.c()
            if (r3 == 0) goto L2a
            com.fourthline.orca.internal.Qa r3 = r2.getValue()
            r0 = 0
            if (r3 == 0) goto L14
            java.lang.String r3 = r3.getIssuingCountry()
            goto L15
        L14:
            r3 = r0
        L15:
            if (r3 == 0) goto L23
            com.fourthline.orca.internal.Qa r2 = r2.getValue()
            if (r2 == 0) goto L21
            java.lang.String r0 = r2.getDocumentType()
        L21:
            if (r0 != 0) goto L2a
        L23:
            com.fourthline.orca.internal.oc$h r2 = com.fourthline.orca.internal.AbstractC3641oc.h.f34201a
            java.util.List r2 = p013kotlin.collections.v.e(r2)
            return r2
        L2a:
            java.util.List r2 = p013kotlin.collections.v.m()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3324h0.a(com.fourthline.orca.internal.va, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String a(DocumentScannerStep documentScannerStep, Ez ez2) {
        String strB;
        if (ez2 != null && (strB = ez2.b()) != null) {
            if (!p013kotlin.jvm.internal.s.f(ez2.c(), AbstractC3367i0.b(documentScannerStep))) {
                strB = null;
            }
            if (strB != null) {
                return strB;
            }
        }
        return this.f32141a.b(documentScannerStep);
    }
}
