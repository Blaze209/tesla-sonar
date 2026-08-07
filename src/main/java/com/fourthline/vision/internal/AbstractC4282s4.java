package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;

/* JADX INFO: renamed from: com.fourthline.vision.internal.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4282s4 implements M5, InterfaceC4237m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K2 f38835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T2 f38836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4258p0 f38837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f38838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private wn0.l f38839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private wn0.l f38840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private wn0.a f38841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38842h;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s4$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f38846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f38847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38848f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f38850h;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38848f = obj;
            this.f38850h |= Integer.MIN_VALUE;
            return AbstractC4282s4.this.onImageReceived(null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.s4$b */
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.p, SuspendFunction {
        b(Object obj) {
            super(2, obj, AbstractC4282s4.class, "onImageReceived", "onImageReceived(Landroid/media/Image;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        public final Object invoke(Image image, Continuation<? super jn0.h0> continuation) {
            return ((AbstractC4282s4) this.receiver).onImageReceived(image, continuation);
        }
    }

    public AbstractC4282s4(K2 imageSource, T2 isSteadyDataSource, InterfaceC4258p0 compositeStep, List<? extends G5> preconditions) {
        p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        p013kotlin.jvm.internal.s.k(compositeStep, "compositeStep");
        p013kotlin.jvm.internal.s.k(preconditions, "preconditions");
        this.f38835a = imageSource;
        this.f38836b = isSteadyDataSource;
        this.f38837c = compositeStep;
        this.f38838d = preconditions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:39:0x00b6, B:41:0x00bc, B:42:0x00c6, B:44:0x00ca, B:45:0x00d6, B:46:0x00db, B:28:0x0074, B:30:0x007a, B:36:0x009e), top: B:53:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.fourthline.vision.internal.J5, com.fourthline.vision.internal.p0] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.fourthline.vision.internal.s4] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.fourthline.vision.internal.s4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.media.Image] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.fourthline.vision.internal.s4] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.fourthline.vision.internal.s4, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0095 -> B:34:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object onImageReceived(android.media.Image r9, p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.AbstractC4282s4.onImageReceived(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void onStepError(Throwable th2) throws AbstractC4255o4.h {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(th2);
        if (!(th2 instanceof AbstractC4255o4.f.a)) {
            if (th2 instanceof AbstractC4255o4.d) {
                invokeStepUpdateOrComplete();
            } else {
                if (!(th2 instanceof AbstractC4255o4)) {
                    th2.printStackTrace();
                    throw new AbstractC4255o4.h(th2);
                }
                wn0.l<Try<? extends K5>, jn0.h0> stepResultListener = getStepResultListener();
                if (stepResultListener != null) {
                    stepResultListener.invoke(TryKt.failure(th2));
                }
            }
        }
        if (this.f38837c.isCompleted()) {
            setCompleted(true);
        }
    }

    @Override // com.fourthline.vision.internal.M5
    public wn0.a<jn0.h0> getOnCompletedListener() {
        return this.f38841g;
    }

    @Override // com.fourthline.vision.internal.M5
    public I5 getStepConfig() {
        return this.f38837c.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.M5
    public wn0.l<I5, jn0.h0> getStepListener() {
        return this.f38840f;
    }

    @Override // com.fourthline.vision.internal.M5
    public wn0.l<Try<? extends K5>, jn0.h0> getStepResultListener() {
        return this.f38839e;
    }

    @Override // com.fourthline.vision.internal.M5
    public int getStepsCount() {
        return this.f38837c.getStepsCount();
    }

    protected final jn0.h0 invokeStepUpdateOrComplete() {
        if (this.f38837c.isCompleted()) {
            setCompleted(true);
            return jn0.h0.f84049a;
        }
        wn0.l<I5, jn0.h0> stepListener = getStepListener();
        if (stepListener == null) {
            return null;
        }
        stepListener.invoke(this.f38837c.getStepConfig());
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f38842h;
    }

    @Override // com.fourthline.vision.internal.M5
    public abstract void moveToNext();

    public abstract void onStepSuccess(K5 k11);

    @Override // com.fourthline.vision.internal.M5
    public void resetAll() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        for (G5 g11 : this.f38838d) {
            g11.stop();
            g11.start();
        }
        this.f38837c.reset();
    }

    @Override // com.fourthline.vision.internal.M5
    public abstract void resetCurrentStep();

    public void setCompleted(boolean z11) {
        this.f38842h = z11;
        if (z11) {
            stop();
            wn0.a<jn0.h0> onCompletedListener = getOnCompletedListener();
            if (onCompletedListener != null) {
                onCompletedListener.invoke();
            }
        }
    }

    @Override // com.fourthline.vision.internal.M5
    public void setOnCompletedListener(wn0.a<jn0.h0> aVar) {
        this.f38841g = aVar;
    }

    @Override // com.fourthline.vision.internal.M5
    public void setStepListener(wn0.l<? super I5, jn0.h0> lVar) {
        this.f38840f = lVar;
    }

    @Override // com.fourthline.vision.internal.M5
    public void setStepResultListener(wn0.l<? super Try<? extends K5>, jn0.h0> lVar) {
        this.f38839e = lVar;
    }

    @Override // com.fourthline.vision.internal.M5, com.fourthline.vision.internal.F5
    public void start() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        wn0.l<I5, jn0.h0> stepListener = getStepListener();
        if (stepListener != null) {
            stepListener.invoke(getStepConfig());
        }
        this.f38837c.start();
        this.f38835a.subscribe(new b(this));
        this.f38835a.start();
        this.f38836b.start();
        Iterator it = this.f38838d.iterator();
        while (it.hasNext()) {
            ((G5) it.next()).start();
        }
    }

    @Override // com.fourthline.vision.internal.M5, com.fourthline.vision.internal.F5
    public void stop() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Iterator it = this.f38838d.iterator();
        while (it.hasNext()) {
            ((G5) it.next()).stop();
        }
        this.f38835a.subscribe(null);
        this.f38836b.stop();
        this.f38837c.stop();
    }
}
