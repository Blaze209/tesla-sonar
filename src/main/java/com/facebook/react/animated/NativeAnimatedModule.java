package com.facebook.react.animated;

import androidx.annotation.NonNull;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@xn.a(name = NativeAnimatedModuleSpec.NAME)
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;

    @NonNull
    private final com.facebook.react.uimanager.g mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mEnqueuedAnimationOnFrame;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<com.facebook.react.animated.o> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;

    @NonNull
    private final a0 mOperations;

    @NonNull
    private final a0 mPreOperations;
    private final com.facebook.react.modules.core.b mReactChoreographer;
    private int mUIManagerType;

    class a extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f22111d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, double d11) {
            super();
            this.f22110c = i11;
            this.f22111d = d11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.v(this.f22110c, this.f22111d);
        }
    }

    private class a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<b0> f22113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b0 f22114b;

        /* JADX WARN: Code duplicated, block: B:15:0x002c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0037 A[LOOP:0: B:6:0x000d->B:19:0x0037, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x002b A[SYNTHETIC] */
        private List<b0> b(long j11) {
            b0 b0VarPoll;
            if (d()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                b0 b0Var = this.f22114b;
                if (b0Var == null) {
                    b0VarPoll = this.f22113a.poll();
                    if (b0VarPoll == null) {
                        if (b0VarPoll.b() > j11) {
                            this.f22114b = b0VarPoll;
                            return arrayList;
                        }
                        arrayList.add(b0VarPoll);
                    }
                } else if (b0Var.b() <= j11) {
                    arrayList.add(this.f22114b);
                    this.f22114b = null;
                    b0VarPoll = this.f22113a.poll();
                    if (b0VarPoll == null) {
                        if (b0VarPoll.b() > j11) {
                            this.f22114b = b0VarPoll;
                            return arrayList;
                        }
                        arrayList.add(b0VarPoll);
                    }
                }
                return arrayList;
            }
        }

        void a(b0 b0Var) {
            this.f22113a.add(b0Var);
        }

        void c(long j11, com.facebook.react.animated.o oVar) {
            List<b0> listB = b(j11);
            if (listB != null) {
                Iterator<b0> it = listB.iterator();
                while (it.hasNext()) {
                    it.next().a(oVar);
                }
            }
        }

        boolean d() {
            return this.f22113a.isEmpty() && this.f22114b == null;
        }

        private a0() {
            this.f22113a = new ConcurrentLinkedQueue();
            this.f22114b = null;
        }
    }

    class b extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f22117d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, double d11) {
            super();
            this.f22116c = i11;
            this.f22117d = d11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.u(this.f22116c, this.f22117d);
        }
    }

    private abstract class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f22119a;

        abstract void a(com.facebook.react.animated.o oVar);

        public long b() {
            return this.f22119a;
        }

        public void c(long j11) {
            this.f22119a = j11;
        }

        private b0() {
            this.f22119a = -1L;
        }
    }

    class c extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22121c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super();
            this.f22121c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.j(this.f22121c);
        }
    }

    class d extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22123c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super();
            this.f22123c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.i(this.f22123c);
        }
    }

    class e extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f22127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callback f22128f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, int i12, ReadableMap readableMap, Callback callback) {
            super();
            this.f22125c = i11;
            this.f22126d = i12;
            this.f22127e = readableMap;
            this.f22128f = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.w(this.f22125c, this.f22126d, this.f22127e, this.f22128f);
        }
    }

    class f extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11) {
            super();
            this.f22130c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.y(this.f22130c);
        }
    }

    class g extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22133d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, int i12) {
            super();
            this.f22132c = i11;
            this.f22133d = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.d(this.f22132c, this.f22133d);
        }
    }

    class h extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22136d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11, int i12) {
            super();
            this.f22135c = i11;
            this.f22136d = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.g(this.f22135c, this.f22136d);
        }
    }

    class i extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22139d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i11, int i12) {
            super();
            this.f22138c = i11;
            this.f22139d = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.c(this.f22138c, this.f22139d);
        }
    }

    class j extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22142d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11, int i12) {
            super();
            this.f22141c = i11;
            this.f22142d = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.f(this.f22141c, this.f22142d);
        }
    }

    class k extends com.facebook.react.uimanager.g {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.g
        protected void doFrameGuarded(long j11) {
            try {
                NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                com.facebook.react.animated.o nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.o()) {
                    nodesManager.t(j11);
                }
                if (nodesManager != null && NativeAnimatedModule.this.mReactChoreographer != null) {
                    if (!tn.b.m() || nodesManager.o()) {
                        NativeAnimatedModule.this.enqueueFrameCallback();
                    }
                }
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    class l extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i11) {
            super();
            this.f22145c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.s(this.f22145c);
        }
    }

    class m extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f22148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f22149e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i11, String str, ReadableMap readableMap) {
            super();
            this.f22147c = i11;
            this.f22148d = str;
            this.f22149e = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.b(this.f22147c, this.f22148d, this.f22149e);
        }
    }

    class n extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f22152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f22153e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i11, String str, int i12) {
            super();
            this.f22151c = i11;
            this.f22152d = str;
            this.f22153e = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.r(this.f22151c, this.f22152d, this.f22153e);
        }
    }

    class o extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callback f22156d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i11, Callback callback) {
            super();
            this.f22155c = i11;
            this.f22156d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.m(this.f22155c, this.f22156d);
        }
    }

    class p extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableArray f22159d;

        class a implements com.facebook.react.animated.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f22161a;

            a(int i11) {
                this.f22161a = i11;
            }

            @Override // com.facebook.react.animated.c
            public void a(double d11) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("tag", this.f22161a);
                writableMapCreateMap.putDouble("value", d11);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i11, ReadableArray readableArray) {
            super();
            this.f22158c = i11;
            this.f22159d = readableArray;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i11 = 0;
            while (i11 < this.f22158c) {
                int i12 = i11 + 1;
                switch (q.f22163a[z.fromId(this.f22159d.getInt(i11)).ordinal()]) {
                    case 1:
                        i11 += 2;
                        oVar.m(this.f22159d.getInt(i12), null);
                        break;
                    case 2:
                        i11 += 2;
                        int i13 = this.f22159d.getInt(i12);
                        oVar.x(i13, new a(i13));
                        break;
                    case 3:
                        i11 += 2;
                        oVar.A(this.f22159d.getInt(i12));
                        break;
                    case 4:
                        i11 += 2;
                        oVar.y(this.f22159d.getInt(i12));
                        break;
                    case 5:
                        i11 += 2;
                        oVar.j(this.f22159d.getInt(i12));
                        break;
                    case 6:
                        i11 += 2;
                        oVar.i(this.f22159d.getInt(i12));
                        break;
                    case 7:
                        i11 += 2;
                        oVar.s(this.f22159d.getInt(i12));
                        break;
                    case 8:
                        i11 += 2;
                        oVar.h(this.f22159d.getInt(i12));
                        break;
                    case 9:
                    case 10:
                        i11 += 2;
                        break;
                    case 11:
                        int i14 = i11 + 2;
                        i11 += 3;
                        oVar.e(this.f22159d.getInt(i12), this.f22159d.getMap(i14));
                        break;
                    case 12:
                        int i15 = i11 + 2;
                        i11 += 3;
                        oVar.B(this.f22159d.getInt(i12), this.f22159d.getMap(i15));
                        break;
                    case 13:
                        int i16 = i11 + 2;
                        i11 += 3;
                        oVar.d(this.f22159d.getInt(i12), this.f22159d.getInt(i16));
                        break;
                    case 14:
                        int i17 = i11 + 2;
                        i11 += 3;
                        oVar.g(this.f22159d.getInt(i12), this.f22159d.getInt(i17));
                        break;
                    case 15:
                        int i18 = i11 + 2;
                        i11 += 3;
                        oVar.v(this.f22159d.getInt(i12), this.f22159d.getDouble(i18));
                        break;
                    case 16:
                        int i19 = i11 + 2;
                        i11 += 3;
                        oVar.v(this.f22159d.getInt(i12), this.f22159d.getDouble(i19));
                        break;
                    case 17:
                        int i21 = i11 + 2;
                        int i22 = this.f22159d.getInt(i12);
                        i11 += 3;
                        int i23 = this.f22159d.getInt(i21);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i23);
                        oVar.f(i22, i23);
                        break;
                    case 18:
                        if (tn.b.m()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                        int i24 = this.f22159d.getInt(i12);
                        int i25 = i11 + 3;
                        int i26 = this.f22159d.getInt(i11 + 2);
                        i11 += 4;
                        oVar.w(i24, i26, this.f22159d.getMap(i25), null);
                        break;
                    case 19:
                        int i27 = this.f22159d.getInt(i12);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i27);
                        int i28 = i11 + 3;
                        String string = this.f22159d.getString(i11 + 2);
                        i11 += 4;
                        oVar.r(i27, string, this.f22159d.getInt(i28));
                        break;
                    case 20:
                        int i29 = i11 + 2;
                        i11 += 3;
                        oVar.c(this.f22159d.getInt(i12), this.f22159d.getInt(i29));
                        break;
                    case 21:
                        int i31 = this.f22159d.getInt(i12);
                        int i32 = i11 + 3;
                        String string2 = this.f22159d.getString(i11 + 2);
                        i11 += 4;
                        oVar.b(i31, string2, this.f22159d.getMap(i32));
                        break;
                    default:
                        throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                }
            }
        }
    }

    static /* synthetic */ class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22163a;

        static {
            int[] iArr = new int[z.values().length];
            f22163a = iArr;
            try {
                iArr[z.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22163a[z.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22163a[z.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22163a[z.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22163a[z.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22163a[z.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22163a[z.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22163a[z.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22163a[z.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22163a[z.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22163a[z.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22163a[z.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22163a[z.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22163a[z.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22163a[z.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22163a[z.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22163a[z.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22163a[z.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22163a[z.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22163a[z.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22163a[z.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    class r implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f22164a;

        r(long j11) {
            this.f22164a = j11;
        }

        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            NativeAnimatedModule.this.mPreOperations.c(this.f22164a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class s implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f22166a;

        s(long j11) {
            this.f22166a = j11;
        }

        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            NativeAnimatedModule.this.mOperations.c(this.f22166a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class t extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f22169d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i11, ReadableMap readableMap) {
            super();
            this.f22168c = i11;
            this.f22169d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.e(this.f22168c, this.f22169d);
        }
    }

    class u extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f22172d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i11, ReadableMap readableMap) {
            super();
            this.f22171c = i11;
            this.f22172d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.B(this.f22171c, this.f22172d);
        }
    }

    class v implements com.facebook.react.animated.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22174a;

        v(int i11) {
            this.f22174a = i11;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d11) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", this.f22174a);
            writableMapCreateMap.putDouble("value", d11);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }
    }

    class w extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.animated.c f22177d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i11, com.facebook.react.animated.c cVar) {
            super();
            this.f22176c = i11;
            this.f22177d = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.x(this.f22176c, this.f22177d);
        }
    }

    class x extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(int i11) {
            super();
            this.f22179c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.A(this.f22179c);
        }
    }

    class y extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(int i11) {
            super();
            this.f22181c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.b0
        public void a(com.facebook.react.animated.o oVar) {
            oVar.h(this.f22181c);
        }
    }

    private enum z {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);

        private static z[] valueMap = null;
        private final int value;

        z(int i11) {
            this.value = i11;
        }

        public static z fromId(int i11) {
            if (valueMap == null) {
                valueMap = values();
            }
            return valueMap[i11 - 1];
        }

        public int getValue() {
            return this.value;
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new a0();
        this.mPreOperations = new a0();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = com.facebook.react.modules.core.b.h();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void addOperation(b0 b0Var) {
        b0Var.c(this.mCurrentBatchNumber);
        this.mOperations.a(b0Var);
    }

    private void addPreOperation(b0 b0Var) {
        b0Var.c(this.mCurrentBatchNumber);
        this.mPreOperations.a(b0Var);
    }

    private void addUnbatchedOperation(b0 b0Var) {
        b0Var.c(-1L);
        this.mOperations.a(b0Var);
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.b) gn.a.c(this.mReactChoreographer)).n(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i11) {
        if (oo.a.a(i11) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i12 = this.mNumNonFabricAnimations;
        if (i12 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else {
            if (this.mNumFabricAnimations != 0 || i12 <= 0 || this.mUIManagerType == 1) {
                return;
            }
            this.mUIManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (this.mEnqueuedAnimationOnFrame) {
            return;
        }
        ((com.facebook.react.modules.core.b) gn.a.c(this.mReactChoreographer)).k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = true;
    }

    private void initializeLifecycleEventListenersForViewTag(int i11) {
        UIManager uIManagerG;
        int iA = oo.a.a(i11);
        this.mUIManagerType = iA;
        if (iA == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        com.facebook.react.animated.o nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.p(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (uIManagerG = b1.g(reactApplicationContext, this.mUIManagerType)) == null) {
            return;
        }
        uIManagerG.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d11, String str, ReadableMap readableMap) {
        int i11 = (int) d11;
        initializeLifecycleEventListenersForViewTag(i11);
        addOperation(new m(i11, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d11, double d12) {
        int i11 = (int) d12;
        initializeLifecycleEventListenersForViewTag(i11);
        addOperation(new i((int) d11, i11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d11, double d12) {
        addOperation(new g((int) d11, (int) d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d11, ReadableMap readableMap) {
        addOperation(new t((int) d11, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j11 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j11 = this.mCurrentBatchNumber;
            }
        }
        this.mPreOperations.c(j11, getNodesManager());
        this.mOperations.c(j11, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d11, double d12) {
        int i11 = (int) d12;
        decrementInFlightAnimationsForViewTag(i11);
        addOperation(new j((int) d11, i11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d11, double d12) {
        addOperation(new h((int) d11, (int) d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d11) {
        addOperation(new y((int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d11) {
        addOperation(new d((int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d11) {
        addOperation(new c((int) d11));
    }

    public com.facebook.react.animated.o getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            androidx.camera.view.i.a(this.mNodesManager, null, new com.facebook.react.animated.o(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d11, Callback callback) {
        addOperation(new o((int) d11, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            switch (q.f22163a[z.fromId(readableArray.getInt(i11)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i11 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i11 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i13 = i11 + 2;
                    i11 += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i13));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i12));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i11 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new p(size, readableArray));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d11, String str, double d12) {
        int i11 = (int) d11;
        decrementInFlightAnimationsForViewTag(i11);
        addOperation(new n(i11, str, (int) d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d11) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d11) {
        addPreOperation(new l((int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d11, double d12) {
        addOperation(new b((int) d11, d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d11, double d12) {
        addOperation(new a((int) d11, d12));
    }

    public void setNodesManager(com.facebook.react.animated.o oVar) {
        this.mNodesManager.set(oVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d11, double d12, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new e((int) d11, (int) d12, readableMap, callback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d11) {
        int i11 = (int) d11;
        addOperation(new w(i11, new v(i11)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d11) {
        addOperation(new f((int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d11) {
        addOperation(new x((int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d11, ReadableMap readableMap) {
        addOperation(new u((int) d11, readableMap));
    }

    public void userDrivenScrollEnded(int i11) {
        com.facebook.react.animated.o oVar = this.mNodesManager.get();
        if (oVar == null) {
            return;
        }
        Set<Integer> setL = oVar.l(i11, "topScrollEnded");
        if (setL.isEmpty()) {
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<Integer> it = setL.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushInt(it.next().intValue());
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("tags", writableArrayCreateArray);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.d() && this.mPreOperations.d()) || this.mUIManagerType == 2) {
            return;
        }
        long j11 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j11;
        r rVar = new r(j11);
        s sVar = new s(j11);
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(rVar);
        uIManagerModule.addUIBlock(sVar);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }
}
