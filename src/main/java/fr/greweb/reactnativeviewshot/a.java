package fr.greweb.reactnativeviewshot;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Base64;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes8.dex */
public class a implements z0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f66363o = "a";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static byte[] f66364p = new byte[65536];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f66365q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<Bitmap> f66366r = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f66367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f66368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @c
    private final int f66369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f66370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f66371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f66372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f66373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f66374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Promise f66375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Boolean f66376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ReactApplicationContext f66377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f66378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Activity f66379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f66380n;

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.a$a, reason: collision with other inner class name */
    class RunnableC1351a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f66381a;

        RunnableC1351a(t tVar) {
            this.f66381a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                View viewFindViewById = a.this.f66367a == -1 ? a.this.f66379m.getWindow().getDecorView().findViewById(R.id.content) : this.f66381a.resolveView(a.this.f66367a);
                if (viewFindViewById == null) {
                    Log.e(a.f66363o, "No view found with reactTag: " + a.this.f66367a, new AssertionError());
                    a.this.f66375i.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + a.this.f66367a);
                    return;
                }
                d dVar = new d(a.f66364p);
                dVar.t(a.u(viewFindViewById));
                a.f66364p = dVar.p();
                if ("tmpfile".equals(a.this.f66374h) && -1 == a.this.f66369c) {
                    a.this.y(viewFindViewById);
                    return;
                }
                if ("tmpfile".equals(a.this.f66374h) && -1 != a.this.f66369c) {
                    a.this.z(viewFindViewById);
                    return;
                }
                if (!"base64".equals(a.this.f66374h) && !"zip-base64".equals(a.this.f66374h)) {
                    if ("data-uri".equals(a.this.f66374h)) {
                        a.this.x(viewFindViewById);
                        return;
                    }
                    return;
                }
                a.this.w(viewFindViewById);
            } catch (Throwable th2) {
                Log.e(a.f66363o, "Failed to capture view snapshot", th2);
                a.this.f66375i.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
            }
        }
    }

    class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f66383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f66384b;

        b(int[] iArr, CountDownLatch countDownLatch) {
            this.f66383a = iArr;
            this.f66384b = countDownLatch;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i11) {
            this.f66383a[0] = i11;
            this.f66384b.countDown();
        }
    }

    public @interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Bitmap.CompressFormat[] f66386a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    public static class d extends ByteArrayOutputStream {
        public d(@NonNull byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        protected static int o(int i11) {
            if (i11 >= 0) {
                return i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            throw new OutOfMemoryError();
        }

        @NonNull
        public ByteBuffer c(int i11) {
            if (((ByteArrayOutputStream) this).buf.length < i11) {
                n(i11);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        protected void n(int i11) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i11 < 0) {
                length = i11;
            }
            if (length - 2147483639 > 0) {
                length = o(i11);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }

        public byte[] p() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public void t(int i11) {
            ((ByteArrayOutputStream) this).count = i11;
        }
    }

    public a(int i11, String str, @c int i12, double d11, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, boolean z11, Promise promise, Executor executor) {
        this.f66367a = i11;
        this.f66368b = str;
        this.f66369c = i12;
        this.f66370d = d11;
        this.f66371e = num;
        this.f66372f = num2;
        this.f66373g = file;
        this.f66374h = str2;
        this.f66376j = bool;
        this.f66377k = reactApplicationContext;
        this.f66379m = activity;
        this.f66378l = z11;
        this.f66375i = promise;
        this.f66380n = executor;
    }

    @NonNull
    private Matrix n(Canvas canvas, @NonNull View view, @NonNull View view2) {
        Matrix matrix = new Matrix();
        LinkedList<View> linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        for (View view4 : linkedList) {
            canvas.save();
            int paddingTop = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                paddingTop = view4.getPaddingTop();
            }
            float translationY = top + paddingTop + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private Point o(@NonNull View view, @NonNull OutputStream outputStream) throws IOException {
        try {
            return p(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x02af  */
    private Point p(@NonNull View view, @NonNull OutputStream outputStream) {
        int height;
        Point point;
        int i11;
        Integer num;
        int i12;
        Handler handler;
        Canvas canvas;
        int width = view.getWidth();
        int height2 = view.getHeight();
        if (width <= 0 || height2 <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        if (this.f66376j.booleanValue()) {
            ScrollView scrollView = (ScrollView) view;
            height = 0;
            for (int i13 = 0; i13 < scrollView.getChildCount(); i13++) {
                height += scrollView.getChildAt(i13).getHeight();
            }
        } else {
            height = height2;
        }
        Point point2 = new Point(width, height);
        Bitmap bitmapS = s(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas2 = new Canvas(bitmapS);
        if (this.f66378l) {
            List<View> listR = r(view);
            ArrayList<SurfaceView> arrayList = new ArrayList();
            for (View view2 : listR) {
                if ((view2 instanceof SurfaceView) && view2.getVisibility() == 0) {
                    arrayList.add((SurfaceView) view2);
                }
            }
            i11 = -1;
            if (!arrayList.isEmpty()) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = false;
                ArrayList arrayList3 = new ArrayList();
                HandlerThread handlerThread = new HandlerThread("PixelCopyThread");
                handlerThread.start();
                Handler handler2 = new Handler(handlerThread.getLooper());
                for (SurfaceView surfaceView : arrayList) {
                    Point point3 = point2;
                    HandlerThread handlerThread2 = handlerThread;
                    int[] iArr2 = iArr;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    int[] iArr3 = {-1};
                    List<View> list = listR;
                    try {
                        PixelCopy.request(surfaceView, bitmapCreateBitmap, new b(iArr3, countDownLatch), handler2);
                        handler = handler2;
                        canvas = canvas2;
                        try {
                            countDownLatch.await(5L, TimeUnit.SECONDS);
                        } catch (Exception e11) {
                            e = e11;
                            Log.e(f66363o, "PixelCopy failed for SurfaceView", e);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        handler = handler2;
                        canvas = canvas2;
                    }
                    if (iArr3[0] != 0) {
                        Log.w(f66363o, "PixelCopy returned " + iArr3[0] + ", skipping SurfaceView");
                    } else {
                        arrayList2.add(bitmapCreateBitmap);
                        int[] iArr4 = new int[2];
                        surfaceView.getLocationOnScreen(iArr4);
                        arrayList3.add(new int[]{iArr4[0] - iArr2[0], iArr4[1] - iArr2[1]});
                    }
                    point2 = point3;
                    handlerThread = handlerThread2;
                    iArr = iArr2;
                    listR = list;
                    canvas2 = canvas;
                    handler2 = handler;
                }
                point = point2;
                Canvas canvas3 = canvas2;
                List<View> list2 = listR;
                handlerThread.quitSafely();
                if (arrayList2.isEmpty()) {
                    canvas2 = canvas3;
                } else {
                    try {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas4 = new Canvas(bitmapCreateBitmap2);
                        view.draw(canvas4);
                        for (View view3 : list2) {
                            if ((view3 instanceof TextureView) && view3.getVisibility() == 0) {
                                TextureView textureView = (TextureView) view3;
                                textureView.setOpaque(z11);
                                Bitmap bitmap = textureView.getBitmap(t(view3.getWidth(), view3.getHeight()));
                                int iSave = canvas4.save();
                                n(canvas4, view, view3);
                                canvas4.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                                canvas4.restoreToCount(iSave);
                                v(bitmap);
                            }
                            z11 = false;
                        }
                        int i14 = 0;
                        while (i14 < arrayList2.size()) {
                            int[] iArr5 = (int[]) arrayList3.get(i14);
                            Canvas canvas5 = canvas3;
                            canvas5.drawBitmap((Bitmap) arrayList2.get(i14), iArr5[0], iArr5[1], paint);
                            i14++;
                            canvas3 = canvas5;
                        }
                        canvas3.drawBitmap(bitmapCreateBitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                        v(bitmapCreateBitmap2);
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            v((Bitmap) it.next());
                        }
                    } catch (Throwable th2) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            v((Bitmap) it2.next());
                        }
                        throw th2;
                    }
                }
                num = this.f66371e;
                if (num != null && this.f66372f != null && (num.intValue() != width || this.f66372f.intValue() != height)) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapS, this.f66371e.intValue(), this.f66372f.intValue(), true);
                    v(bitmapS);
                    bitmapS = bitmapCreateScaledBitmap;
                }
                i12 = this.f66369c;
                if (i11 == i12 || !(outputStream instanceof d)) {
                    bitmapS.compress(c.f66386a[i12], (int) (this.f66370d * 100.0d), outputStream);
                } else {
                    int i15 = width * height * 4;
                    d dVar = (d) q(outputStream);
                    bitmapS.copyPixelsToBuffer(dVar.c(i15));
                    dVar.t(i15);
                }
                v(bitmapS);
                return point;
            }
            point = point2;
        } else {
            point = point2;
            i11 = -1;
        }
        view.draw(canvas2);
        for (View view4 : r(view)) {
            if ((view4 instanceof TextureView) && view4.getVisibility() == 0) {
                TextureView textureView2 = (TextureView) view4;
                textureView2.setOpaque(false);
                Bitmap bitmap2 = textureView2.getBitmap(t(view4.getWidth(), view4.getHeight()));
                int iSave2 = canvas2.save();
                n(canvas2, view, view4);
                canvas2.drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                canvas2.restoreToCount(iSave2);
                v(bitmap2);
            }
        }
        num = this.f66371e;
        if (num != null) {
            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapS, this.f66371e.intValue(), this.f66372f.intValue(), true);
            v(bitmapS);
            bitmapS = bitmapCreateScaledBitmap2;
        }
        i12 = this.f66369c;
        if (i11 == i12) {
            bitmapS.compress(c.f66386a[i12], (int) (this.f66370d * 100.0d), outputStream);
        } else {
            bitmapS.compress(c.f66386a[i12], (int) (this.f66370d * 100.0d), outputStream);
        }
        v(bitmapS);
        return point;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends A, A> T q(A a11) {
        return a11;
    }

    @NonNull
    private List<View> r(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            arrayList2.addAll(r(viewGroup.getChildAt(i11)));
        }
        return arrayList2;
    }

    @NonNull
    private static Bitmap s(int i11, int i12) {
        synchronized (f66365q) {
            try {
                for (Bitmap bitmap : f66366r) {
                    if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
                        f66366r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    private static Bitmap t(int i11, int i12) {
        synchronized (f66365q) {
            try {
                for (Bitmap bitmap : f66366r) {
                    if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
                        f66366r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u(@NonNull View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    private static void v(@NonNull Bitmap bitmap) {
        synchronized (f66365q) {
            f66366r.add(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(@NonNull View view) throws IOException {
        String str;
        boolean z11 = -1 == this.f66369c;
        boolean zEquals = "zip-base64".equals(this.f66374h);
        d dVar = new d(f66364p);
        Point pointO = o(view, dVar);
        f66364p = dVar.p();
        int size = dVar.size();
        String str2 = String.format(Locale.US, "%d:%d|", Integer.valueOf(pointO.x), Integer.valueOf(pointO.y));
        if (!z11) {
            str2 = "";
        }
        if (zEquals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f66364p, 0, size);
            deflater.finish();
            d dVar2 = new d(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                dVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = str2 + Base64.encodeToString(dVar2.p(), 0, dVar2.size(), 2);
        } else {
            str = str2 + Base64.encodeToString(f66364p, 0, size, 2);
        }
        this.f66375i.resolve(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(@NonNull View view) throws IOException {
        d dVar = new d(f66364p);
        o(view, dVar);
        f66364p = dVar.p();
        String strEncodeToString = Base64.encodeToString(f66364p, 0, dVar.size(), 2);
        String str = "jpg".equals(this.f66368b) ? "jpeg" : this.f66368b;
        this.f66375i.resolve("data:image/" + str + ";base64," + strEncodeToString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(@NonNull View view) throws IOException {
        String string = Uri.fromFile(this.f66373g).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f66373g);
        d dVar = new d(f66364p);
        Point pointO = o(view, dVar);
        f66364p = dVar.p();
        int size = dVar.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(pointO.x), Integer.valueOf(pointO.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(f66364p, 0, size);
        fileOutputStream.close();
        this.f66375i.resolve(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(@NonNull View view) throws IOException {
        o(view, new FileOutputStream(this.f66373g));
        this.f66375i.resolve(Uri.fromFile(this.f66373g).toString());
    }

    @Override // com.facebook.react.uimanager.z0
    public void execute(t tVar) {
        this.f66380n.execute(new RunnableC1351a(tVar));
    }
}
