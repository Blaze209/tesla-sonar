package vl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0002/2B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001e\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b#\u0010$J'\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010%\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0017¢\u0006\u0004\b+\u0010,J-\u0010/\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140-H\u0017¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0014H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00108R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0014\u0010>\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010=R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010=R\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010HR\u0016\u0010J\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010=R\"\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010LR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lvl/g;", "Lvl/j;", "Lmm/d;", "platformBitmapFactory", "Lrl/c;", "bitmapFrameRenderer", "Lul/c;", "fpsCompressor", "Lql/d;", "animationInformation", "", "bufferLengthMilliseconds", "<init>", "(Lmm/d;Lrl/c;Lul/c;Lql/d;I)V", "targetFrame", "Lvl/l;", IntegerTokenConverter.CONVERTER_KEY, "(I)Lvl/l;", Snapshot.WIDTH, Snapshot.HEIGHT, "Ljn0/h0;", "l", "(II)V", "count", "", "f", "(IIII)Z", "Ltk/a;", "Landroid/graphics/Bitmap;", "targetBitmap", "n", "(Ltk/a;III)V", "Lvl/a;", "h", "(I)Lvl/a;", "e", "(Ltk/a;)V", "src", "o", "(Ltk/a;Landroid/graphics/Bitmap;)Ltk/a;", "j", "(Lql/d;)I", "frameNumber", "c", "(III)Lvl/l;", "Lkotlin/Function0;", "onAnimationLoaded", "a", "(IILwn0/a;)V", "fps", "b", "(I)V", "clear", "()V", "Lmm/d;", "Lrl/c;", "Lul/c;", DateTokenConverter.CONVERTER_KEY, "Lql/d;", "k", "()Lql/d;", "I", "bufferSize", "Ljava/util/concurrent/ConcurrentHashMap;", "Lvl/g$a;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "bufferFramesHash", "thresholdFrame", "Z", "isFetching", "Lvl/h;", "Lvl/h;", "frameSequence", "lastRenderedFrameNumber", "", "Ljava/util/Map;", "compressionFrameMap", "", "m", "Ljava/util/Set;", "renderableFrameIndexes", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mm.d platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rl.c bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ul.c fpsCompressor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ql.d animationInformation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int bufferLengthMilliseconds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int bufferSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<Integer, a> bufferFramesHash;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile int thresholdFrame;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isFetching;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h frameSequence;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int lastRenderedFrameNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, Integer> compressionFrameMap;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Set<Integer> renderableFrameIndexes;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, d2 = {"Lvl/g$a;", "", "Ltk/a;", "Landroid/graphics/Bitmap;", "bitmapRef", "<init>", "(Ltk/a;)V", "Ljn0/h0;", "c", "()V", "a", "Ltk/a;", "()Ltk/a;", "", "b", "Z", "isUpdatingFrame", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "isFrameAvailable", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final tk.a<Bitmap> bitmapRef;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isUpdatingFrame;

        public a(tk.a<Bitmap> bitmapRef) {
            s.k(bitmapRef, "bitmapRef");
            this.bitmapRef = bitmapRef;
        }

        public final tk.a<Bitmap> a() {
            return this.bitmapRef;
        }

        public final boolean b() {
            return !this.isUpdatingFrame && this.bitmapRef.J();
        }

        public final void c() {
            tk.a.C(this.bitmapRef);
        }

        public final void d(boolean z11) {
            this.isUpdatingFrame = z11;
        }
    }

    public g(mm.d platformBitmapFactory, rl.c bitmapFrameRenderer, ul.c fpsCompressor, ql.d animationInformation, int i11) {
        s.k(platformBitmapFactory, "platformBitmapFactory");
        s.k(bitmapFrameRenderer, "bitmapFrameRenderer");
        s.k(fpsCompressor, "fpsCompressor");
        s.k(animationInformation, "animationInformation");
        this.platformBitmapFactory = platformBitmapFactory;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.fpsCompressor = fpsCompressor;
        this.animationInformation = animationInformation;
        this.bufferLengthMilliseconds = i11;
        int iF = n.f((j(getAnimationInformation()) * i11) / 1000, 1);
        this.bufferSize = iF;
        this.bufferFramesHash = new ConcurrentHashMap<>();
        this.frameSequence = new h(getAnimationInformation().a());
        this.lastRenderedFrameNumber = -1;
        this.compressionFrameMap = v0.i();
        this.renderableFrameIndexes = d1.d();
        b(j(getAnimationInformation()));
        this.thresholdFrame = (int) (iF * 0.5f);
    }

    private final void e(tk.a<Bitmap> aVar) {
        if (aVar.J()) {
            new Canvas(aVar.H()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    private final boolean f(int targetFrame, int width, int height, int count) {
        int iIntValue;
        tk.a<Bitmap> aVarA;
        List<Integer> listD = this.frameSequence.d(targetFrame, this.bufferSize);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (this.renderableFrameIndexes.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set setR1 = v.r1(arrayList);
        Set<Integer> setKeySet = this.bufferFramesHash.keySet();
        s.j(setKeySet, "<get-keys>(...)");
        ArrayDeque arrayDeque = new ArrayDeque(d1.l(setKeySet, setR1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.bufferFramesHash.get(Integer.valueOf(iIntValue2)) == null) {
                int i11 = this.lastRenderedFrameNumber;
                if (i11 != -1 && !setR1.contains(Integer.valueOf(i11))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int iIntValue3 = num != null ? num.intValue() : -1;
                a aVar = this.bufferFramesHash.get(Integer.valueOf(iIntValue3));
                tk.a<Bitmap> aVarP = (aVar == null || (aVarA = aVar.a()) == null) ? null : aVarA.p();
                if (aVarP == null) {
                    tk.a<Bitmap> aVarA2 = this.platformBitmapFactory.a(width, height);
                    s.j(aVarA2, "createBitmap(...)");
                    aVar = new a(aVarA2);
                    aVarP = aVar.a().clone();
                }
                aVar.d(true);
                try {
                    n(aVarP, iIntValue2, width, height);
                    h0 h0Var = h0.f84049a;
                    sn0.b.a(aVarP, null);
                    this.bufferFramesHash.remove(Integer.valueOf(iIntValue3));
                    aVar.d(false);
                    this.bufferFramesHash.put(Integer.valueOf(iIntValue2), aVar);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(aVarP, th2);
                        throw th3;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.bufferSize * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(n.n((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.thresholdFrame = iIntValue;
        return true;
    }

    static /* synthetic */ boolean g(g gVar, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return gVar.f(i11, i12, i13, i14);
    }

    private final vl.a h(int targetFrame) {
        vl.a aVar;
        Iterator<Integer> it = new bo0.j(0, this.frameSequence.getSize()).iterator();
        do {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            int iA = this.frameSequence.a(targetFrame - ((s0) it).nextInt());
            a aVar2 = this.bufferFramesHash.get(Integer.valueOf(iA));
            if (aVar2 != null) {
                if (!aVar2.b()) {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar = new vl.a(iA, aVar2.a());
                }
            }
        } while (aVar == null);
        return aVar;
    }

    private final l i(int targetFrame) {
        vl.a aVarH = h(targetFrame);
        if (aVarH == null) {
            return new l(null, l.a.MISSING);
        }
        tk.a<Bitmap> aVarClone = aVarH.c().clone();
        s.j(aVarClone, "clone(...)");
        this.lastRenderedFrameNumber = aVarH.getFrameNumber();
        return new l(aVarClone, l.a.NEAREST);
    }

    private final int j(ql.d dVar) {
        return (int) n.g(TimeUnit.SECONDS.toMillis(1L) / ((long) (dVar.i() / dVar.a())), 1L);
    }

    private final void l(final int width, final int height) {
        if (this.isFetching) {
            return;
        }
        this.isFetching = true;
        ul.b.f116429a.b(new Runnable() { // from class: vl.f
            @Override // java.lang.Runnable
            public final void run() {
                g.m(this.f119543a, width, height);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(g this$0, int i11, int i12) {
        s.k(this$0, "this$0");
        while (true) {
            g gVar = this$0;
            int i13 = i11;
            int i14 = i12;
            if (g(gVar, n.f(this$0.lastRenderedFrameNumber, 0), i13, i14, 0, 8, null)) {
                gVar.isFetching = false;
                return;
            } else {
                this$0 = gVar;
                i11 = i13;
                i12 = i14;
            }
        }
    }

    private final void n(tk.a<Bitmap> targetBitmap, int targetFrame, int width, int height) {
        tk.a<Bitmap> aVarC;
        tk.a<Bitmap> aVarP;
        vl.a aVarH = h(targetFrame);
        if (aVarH != null && (aVarC = aVarH.c()) != null && (aVarP = aVarC.p()) != null) {
            try {
                int frameNumber = aVarH.getFrameNumber();
                if (frameNumber < targetFrame) {
                    Bitmap bitmapH = aVarP.H();
                    s.j(bitmapH, "get(...)");
                    o(targetBitmap, bitmapH);
                    Iterator<Integer> it = new bo0.j(frameNumber + 1, targetFrame).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((s0) it).nextInt();
                        rl.c cVar = this.bitmapFrameRenderer;
                        Bitmap bitmapH2 = targetBitmap.H();
                        s.j(bitmapH2, "get(...)");
                        cVar.a(iNextInt, bitmapH2);
                    }
                    sn0.b.a(aVarP, null);
                    return;
                }
                h0 h0Var = h0.f84049a;
                sn0.b.a(aVarP, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(aVarP, th2);
                    throw th3;
                }
            }
        }
        e(targetBitmap);
        Iterator<Integer> it2 = new bo0.j(0, targetFrame).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((s0) it2).nextInt();
            rl.c cVar2 = this.bitmapFrameRenderer;
            Bitmap bitmapH3 = targetBitmap.H();
            s.j(bitmapH3, "get(...)");
            cVar2.a(iNextInt2, bitmapH3);
        }
    }

    private final tk.a<Bitmap> o(tk.a<Bitmap> aVar, Bitmap bitmap) {
        if (aVar.J() && !s.f(aVar.H(), bitmap)) {
            Canvas canvas = new Canvas(aVar.H());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
        return aVar;
    }

    @Override // vl.j
    public void a(int width, int height, wn0.a<h0> onAnimationLoaded) {
        s.k(onAnimationLoaded, "onAnimationLoaded");
        l(width, height);
        onAnimationLoaded.invoke();
    }

    @Override // vl.j
    public void b(int fps) {
        Map<Integer, Integer> mapA = this.fpsCompressor.a(getAnimationInformation().i() * n.f(getAnimationInformation().b(), 1), getAnimationInformation().a(), n.j(fps, j(getAnimationInformation())));
        this.compressionFrameMap = mapA;
        this.renderableFrameIndexes = v.r1(mapA.values());
    }

    @Override // vl.j
    public l c(int frameNumber, int width, int height) {
        Integer num = this.compressionFrameMap.get(Integer.valueOf(frameNumber));
        if (num == null) {
            return i(frameNumber);
        }
        int iIntValue = num.intValue();
        this.lastRenderedFrameNumber = iIntValue;
        a aVar = this.bufferFramesHash.get(num);
        if (aVar == null || !aVar.b()) {
            aVar = null;
        }
        if (aVar == null) {
            l(width, height);
            return i(iIntValue);
        }
        if (this.frameSequence.c(this.thresholdFrame, iIntValue, this.bufferSize)) {
            l(width, height);
        }
        return new l(aVar.a().clone(), l.a.SUCCESS);
    }

    @Override // vl.j
    public void clear() {
        Collection<a> collectionValues = this.bufferFramesHash.values();
        s.j(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        this.bufferFramesHash.clear();
        this.lastRenderedFrameNumber = -1;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public ql.d getAnimationInformation() {
        return this.animationInformation;
    }

    @Override // vl.j
    public void onStop() {
        j.a.a(this);
    }
}
