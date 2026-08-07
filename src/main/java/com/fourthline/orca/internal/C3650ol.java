package com.fourthline.orca.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3650ol implements On {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X3 f34305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f34306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WorkflowConfigurationResponse f34307c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ol$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f34311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f34312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f34313f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f34315h;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34313f = obj;
            this.f34315h |= Integer.MIN_VALUE;
            Object objA = C3650ol.this.a(null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ol$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34316a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34318c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34316a = obj;
            this.f34318c |= Integer.MIN_VALUE;
            Object objA = C3650ol.this.a(this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ol$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3650ol f34322d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ol$c$a */
        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3650ol f34324b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f34325c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Un f34326d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3650ol c3650ol, List list, Un un2, Continuation continuation) {
                super(2, continuation);
                this.f34324b = c3650ol;
                this.f34325c = list;
                this.f34326d = un2;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f34324b, this.f34325c, this.f34326d, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f34323a;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    C3650ol c3650ol = this.f34324b;
                    List list = this.f34325c;
                    Un un2 = this.f34326d;
                    this.f34323a = 1;
                    objA = c3650ol.a(list, un2, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    objA = ((jn0.s) obj).getValue();
                }
                jn0.t.b(objA);
                return objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, C3650ol c3650ol, Continuation continuation) {
            super(2, continuation);
            this.f34321c = str;
            this.f34322d = c3650ol;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f34321c, this.f34322d, continuation);
            cVar.f34320b = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34319a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f34320b;
            EnumEntries<Un> enumEntriesC = Un.c();
            String str = this.f34321c;
            C3650ol c3650ol = this.f34322d;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(enumEntriesC, 10));
            for (Un un2 : enumEntriesC) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(c3650ol, p013kotlin.collections.v.p(str + "/videos/android/" + un2.d(), "default/videos/android/" + un2.d()), un2, null), 3, null));
            }
            this.f34319a = 1;
            Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    public C3650ol(X3 downloadWorker, File assetsFourthlineDirectory, WorkflowConfigurationResponse tenantConfig) {
        p013kotlin.jvm.internal.s.k(downloadWorker, "downloadWorker");
        p013kotlin.jvm.internal.s.k(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        p013kotlin.jvm.internal.s.k(tenantConfig, "tenantConfig");
        this.f34305a = downloadWorker;
        this.f34306b = assetsFourthlineDirectory;
        this.f34307c = tenantConfig;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.On
    public Object a(Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f34318c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f34318c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f34316a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f34318c;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                if (!this.f34307c.getTenant().getRemoteAssets().getEnabled()) {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    return jn0.s.b(On.a.C0509a.f27203a);
                }
                String lowerCase = this.f34307c.getTenant().getName().toLowerCase(Locale.ROOT);
                p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
                c cVar = new c(lowerCase, this, null);
                bVar.f34318c = 1;
                if (CoroutineScopeKt.coroutineScope(cVar, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(On.a.C0509a.f27203a);
        } catch (Exception e11) {
            e11.printStackTrace();
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r10, com.fourthline.orca.internal.Un r11, p013kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.fourthline.orca.internal.C3650ol.a
            if (r0 == 0) goto L13
            r0 = r12
            com.fourthline.orca.internal.ol$a r0 = (com.fourthline.orca.internal.C3650ol.a) r0
            int r1 = r0.f34315h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34315h = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ol$a r0 = new com.fourthline.orca.internal.ol$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f34313f
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34315h
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r10 = r0.f34312e
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r0.f34311d
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r2 = r0.f34310c
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.f34309b
            com.fourthline.orca.internal.Un r4 = (com.fourthline.orca.internal.Un) r4
            java.lang.Object r5 = r0.f34308a
            com.fourthline.orca.internal.ol r5 = (com.fourthline.orca.internal.C3650ol) r5
            jn0.t.b(r12)
            jn0.s r12 = (jn0.s) r12
            java.lang.Object r12 = r12.getValue()
            goto L95
        L43:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4b:
            jn0.t.b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            int r2 = p013kotlin.collections.v.y(r10, r2)
            r12.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
            r5 = r11
            r11 = r10
            r10 = r12
            r12 = r5
            r5 = r9
        L62:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            com.fourthline.orca.internal.X3 r4 = r5.f34305a
            com.fourthline.orca.internal.X3$a r6 = new com.fourthline.orca.internal.X3$a
            java.lang.String r7 = r12.b()
            java.io.File r8 = r5.f34306b
            java.lang.String r8 = com.fourthline.orca.internal.BD.a(r12, r8)
            r6.<init>(r7, r2, r8)
            r0.f34308a = r5
            r0.f34309b = r12
            r0.f34310c = r10
            r0.f34311d = r11
            r0.f34312e = r10
            r0.f34315h = r3
            java.lang.Object r2 = r4.a(r6, r0)
            if (r2 != r1) goto L92
            return r1
        L92:
            r4 = r12
            r12 = r2
            r2 = r10
        L95:
            boolean r6 = jn0.s.h(r12)
            if (r6 == 0) goto La2
            com.fourthline.orca.internal.X3$b r12 = (com.fourthline.orca.internal.X3.b) r12
            java.lang.Object r10 = jn0.s.b(r12)
            return r10
        La2:
            jn0.s r12 = jn0.s.a(r12)
            r10.add(r12)
            r10 = r2
            r12 = r4
            goto L62
        Lac:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = p013kotlin.collections.v.A0(r10)
            jn0.s r10 = (jn0.s) r10
            java.lang.Object r10 = r10.getValue()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3650ol.a(java.util.List, com.fourthline.orca.internal.Un, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
