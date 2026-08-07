package org.wonday.pdf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.github.barteksc.pdfviewer.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.legere.pdfiumandroid.DefaultLogger;
import io.legere.pdfiumandroid.util.AlreadyClosedBehavior;
import io.legere.pdfiumandroid.util.Config;
import io.legere.pdfiumandroid.util.ConfigKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import zp.d;
import zp.f;
import zp.h;
import zp.j;

/* JADX INFO: loaded from: classes10.dex */
public class b extends e implements f, d, zp.c, j, zp.b, h, yp.b {
    private int T;
    private boolean U;
    private float V;
    private float W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f99962a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f99963b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f99964c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f99965d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f99966e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f99967f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f99968g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f99969h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f99970i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f99971j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f99972k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private dq.b f99973l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f99974m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f99975n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f99976o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f99977p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f99978q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f99979r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f99980s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f99981t0;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = 1;
        this.U = false;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f99962a0 = 3.0f;
        this.f99964c0 = 10;
        this.f99965d0 = "";
        this.f99966e0 = true;
        this.f99967f0 = true;
        this.f99968g0 = true;
        this.f99969h0 = false;
        this.f99970i0 = false;
        this.f99971j0 = false;
        this.f99972k0 = false;
        this.f99973l0 = dq.b.WIDTH;
        this.f99974m0 = false;
        this.f99975n0 = true;
        this.f99976o0 = false;
        this.f99977p0 = BitmapDescriptorFactory.HUE_RED;
        this.f99978q0 = BitmapDescriptorFactory.HUE_RED;
        this.f99979r0 = BitmapDescriptorFactory.HUE_RED;
        this.f99980s0 = 0;
        this.f99981t0 = 0;
        ConfigKt.setPdfiumConfig(new Config(new DefaultLogger(), AlreadyClosedBehavior.IGNORE));
    }

    private int r0(File file) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
        int pageCount = pdfRenderer.getPageCount();
        pdfRenderer.close();
        parcelFileDescriptorOpen.close();
        return pageCount;
    }

    private Uri s0(String str) {
        Uri uri = Uri.parse(str);
        return (uri.getScheme() == null || uri.getScheme().isEmpty()) ? Uri.fromFile(new File(str)) : uri;
    }

    private void setTouchesEnabled(boolean z11) {
        v0(this, z11);
    }

    private void t0(int i11) {
        O(i11);
    }

    private void u0(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", "linkPressed|" + str);
        EventDispatcher eventDispatcherC = b1.c((v0) getContext(), getId());
        or0.a aVar = new or0.a(b1.f(this), getId(), writableMapCreateMap);
        if (eventDispatcherC != null) {
            eventDispatcherC.h(aVar);
        }
    }

    private static void v0(View view, boolean z11) {
        if (z11) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new a());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                v0(viewGroup.getChildAt(i11), z11);
            }
        }
    }

    private void w0(String str) {
        Log.d("PdfView", str);
    }

    @Override // zp.j
    public boolean a(MotionEvent motionEvent) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", "pageSingleTap|" + this.T + "|" + motionEvent.getX() + "|" + motionEvent.getY());
        EventDispatcher eventDispatcherC = b1.c((v0) getContext(), getId());
        or0.a aVar = new or0.a(b1.f(this), getId(), writableMapCreateMap);
        if (eventDispatcherC == null) {
            return true;
        }
        eventDispatcherC.h(aVar);
        return true;
    }

    @Override // zp.b
    public void b(Canvas canvas, float f11, float f12, int i11) {
        if (this.f99977p0 == BitmapDescriptorFactory.HUE_RED) {
            this.f99977p0 = f11;
        }
        float f13 = this.f99978q0;
        if (f13 > BitmapDescriptorFactory.HUE_RED) {
            float f14 = this.f99979r0;
            if (f14 > BitmapDescriptorFactory.HUE_RED && (f11 != f13 || f12 != f14)) {
                dq.a.b.f60820b = this.W;
                dq.a.b.f60819a = this.f99962a0;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("message", "scaleChanged|" + (f11 / this.f99977p0));
                EventDispatcher eventDispatcherC = b1.c((v0) getContext(), getId());
                or0.a aVar = new or0.a(b1.f(this), getId(), writableMapCreateMap);
                if (eventDispatcherC != null) {
                    eventDispatcherC.h(aVar);
                }
            }
        }
        this.f99978q0 = f11;
        this.f99979r0 = f12;
    }

    @Override // zp.h
    public void c(int i11, float f11) {
        dq.a.b.f60820b = this.W;
        dq.a.b.f60819a = this.f99962a0;
    }

    @Override // yp.b
    public void d(aq.a aVar) {
        String uri = aVar.a().getUri();
        Integer destPageIdx = aVar.a().getDestPageIdx();
        if (uri != null && !uri.isEmpty()) {
            u0(uri);
        } else if (destPageIdx != null) {
            t0(destPageIdx.intValue());
        }
    }

    @Override // zp.f
    public void e(int i11, int i12) {
        int i13 = i11 + 1;
        this.T = i13;
        w0(String.format("%s %s / %s", this.f99963b0, Integer.valueOf(i13), Integer.valueOf(i12)));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", "pageChanged|" + i13 + "|" + i12);
        final EventDispatcher eventDispatcherC = b1.c((v0) getContext(), getId());
        final or0.a aVar = new or0.a(b1.f(this), getId(), writableMapCreateMap);
        if (eventDispatcherC != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.wonday.pdf.a
                @Override // java.lang.Runnable
                public final void run() {
                    eventDispatcherC.h(aVar);
                }
            }, 10L);
        }
    }

    @Override // zp.d
    public void f(int i11) {
        SizeF sizeFB = B(0);
        float width = sizeFB.getWidth();
        float height = sizeFB.getHeight();
        m0(this.V);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", "loadComplete|" + i11 + "|" + width + "|" + height + "|" + new com.google.gson.f().s(getTableOfContents()));
        EventDispatcher eventDispatcherC = b1.c((v0) getContext(), getId());
        or0.a aVar = new or0.a(b1.f(this), getId(), writableMapCreateMap);
        if (eventDispatcherC != null) {
            eventDispatcherC.h(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (K()) {
            q0();
        }
    }

    @Override // zp.c
    public void onError(Throwable th2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (th2.getMessage().contains("Password required or incorrect password")) {
            writableMapCreateMap.putString("message", "error|Password required or incorrect password.");
        } else {
            writableMapCreateMap.putString("message", "error|" + th2.getMessage());
        }
        EventDispatcher eventDispatcherC = b1.c((v0) getContext(), getId());
        or0.a aVar = new or0.a(b1.f(this), getId(), writableMapCreateMap);
        if (eventDispatcherC != null) {
            eventDispatcherC.h(aVar);
        }
    }

    @Override // com.github.barteksc.pdfviewer.e, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        if ((i11 <= 0 || i12 <= 0) && this.f99980s0 <= 0 && this.f99981t0 <= 0) {
            return;
        }
        super.onSizeChanged(i11, i12, this.f99980s0, this.f99981t0);
        this.f99980s0 = i11;
        this.f99981t0 = i12;
    }

    public void q0() {
        e.b bVarA;
        w0(String.format("drawPdf path:%s %s", this.f99963b0, Integer.valueOf(this.T)));
        if (this.f99963b0 != null) {
            setMinZoom(this.W);
            setMaxZoom(this.f99962a0);
            setMidZoom((this.f99962a0 + this.W) / 2.0f);
            dq.a.b.f60820b = this.W;
            dq.a.b.f60819a = this.f99962a0;
            if (this.f99963b0.startsWith("content://")) {
                try {
                    bVarA = z(getContext().getContentResolver().openInputStream(Uri.parse(this.f99963b0)));
                } catch (FileNotFoundException e11) {
                    throw new RuntimeException(e11.getMessage());
                }
            } else {
                bVarA = A(s0(this.f99963b0));
            }
            bVarA.b(this.T - 1).u(this.U).l(this).k(this).j(this).i(this).m(this).t(this.f99964c0).s(this.f99965d0).d(this.f99966e0).o(this.f99973l0).q(this.f99972k0).a(this.f99970i0).p(this.f99971j0).f(!this.f99974m0 && this.f99975n0).e(!this.f99974m0 && this.f99968g0).c(this.f99967f0).g(this);
            if (this.f99976o0) {
                try {
                    int iR0 = r0(new File(this.f99963b0));
                    int[] iArr = new int[iR0];
                    for (int i11 = 0; i11 < iR0; i11++) {
                        iArr[i11] = (iR0 - 1) - i11;
                    }
                    bVarA.r(iArr);
                    if (this.T != 1) {
                        this.T = iR0;
                    }
                } catch (IOException e12) {
                    Log.e(AnalyticsAttribute.Error, "error while reading PDF", e12);
                }
            }
            if (this.f99974m0) {
                bVarA.r(this.T - 1);
                setTouchesEnabled(false);
            } else {
                bVarA.n(this);
            }
            bVarA.h();
        }
    }

    public void setEnableAnnotationRendering(boolean z11) {
        this.f99967f0 = z11;
    }

    public void setEnableAntialiasing(boolean z11) {
        this.f99966e0 = z11;
    }

    public void setEnableDoubleTapZoom(boolean z11) {
        this.f99968g0 = z11;
    }

    public void setEnablePaging(boolean z11) {
        this.f99969h0 = z11;
        if (z11) {
            this.f99970i0 = true;
            this.f99971j0 = true;
            this.f99972k0 = true;
        } else {
            this.f99970i0 = false;
            this.f99971j0 = false;
            this.f99972k0 = false;
        }
    }

    public void setEnableRTL(boolean z11) {
        this.f99976o0 = z11;
    }

    public void setFitPolicy(int i11) {
        if (i11 == 0) {
            this.f99973l0 = dq.b.WIDTH;
        } else if (i11 != 1) {
            this.f99973l0 = dq.b.BOTH;
        } else {
            this.f99973l0 = dq.b.HEIGHT;
        }
    }

    public void setHorizontal(boolean z11) {
        this.U = z11;
    }

    public void setMaxScale(float f11) {
        this.f99962a0 = f11;
    }

    public void setMinScale(float f11) {
        this.W = f11;
    }

    public void setPage(int i11) {
        int iMax = Math.max(i11, 1);
        this.T = iMax;
        t0(iMax - 1);
    }

    public void setPassword(String str) {
        this.f99965d0 = str;
    }

    public void setPath(String str) {
        this.f99963b0 = str;
    }

    public void setScale(float f11) {
        this.V = f11;
    }

    public void setScrollEnabled(boolean z11) {
        this.f99975n0 = z11;
    }

    public void setSinglePage(boolean z11) {
        this.f99974m0 = z11;
    }

    public void setSpacing(int i11) {
        this.f99964c0 = i11;
    }
}
