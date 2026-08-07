package dc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class a extends View {
    private int A;
    private float A0;
    private int B;
    private int B0;
    private int C;
    private int C0;
    private int D;
    private int D0;
    private String E;
    private int E0;
    private String F;
    private int F0;
    private String G;
    private String H;
    private float I;
    private float J;
    private float K;
    private float L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private Scroller U;
    private VelocityTracker V;
    private Paint W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60356a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TextPaint f60357a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60358b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Paint f60359b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60360c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String[] f60361c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60362d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private CharSequence[] f60363d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60364e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private CharSequence[] f60365e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f60366f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private HandlerThread f60367f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f60368g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Handler f60369g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f60370h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Handler f60371h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60372i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Map<String, Integer> f60373i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60374j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private d f60375j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f60376k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private c f60377k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f60378l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private e f60379l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f60380m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f60381m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f60382n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f60383n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60384o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f60385o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f60386p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f60387p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f60388q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f60389q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f60390r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f60391r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f60392s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f60393s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60394t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private float f60395t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f60396u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f60397u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f60398v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f60399v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f60400w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f60401w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f60402x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f60403x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f60404y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f60405y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f60406z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private float f60407z0;

    /* JADX INFO: renamed from: dc.a$a, reason: collision with other inner class name */
    class HandlerC1227a extends Handler {
        HandlerC1227a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int iH;
            int i11;
            int i12 = message.what;
            if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                a.this.W(message.arg1, message.arg2, message.obj);
                return;
            }
            int i13 = 0;
            if (!a.this.U.isFinished()) {
                if (a.this.f60381m0 == 0) {
                    a.this.T(1);
                }
                a.this.f60369g0.sendMessageDelayed(a.this.E(1, 0, 0, message.obj), 32L);
                return;
            }
            if (a.this.C0 != 0) {
                if (a.this.f60381m0 == 0) {
                    a.this.T(1);
                }
                if (a.this.C0 < (-a.this.f60403x0) / 2) {
                    i11 = (int) (((a.this.f60403x0 + a.this.C0) * 300.0f) / a.this.f60403x0);
                    a.this.U.startScroll(0, a.this.D0, 0, a.this.f60403x0 + a.this.C0, i11 * 3);
                    a aVar = a.this;
                    iH = aVar.H(aVar.D0 + a.this.f60403x0 + a.this.C0);
                } else {
                    i11 = (int) (((-a.this.C0) * 300.0f) / a.this.f60403x0);
                    a.this.U.startScroll(0, a.this.D0, 0, a.this.C0, i11 * 3);
                    a aVar2 = a.this;
                    iH = aVar2.H(aVar2.D0 + a.this.C0);
                }
                i13 = i11;
                a.this.postInvalidate();
            } else {
                a.this.T(0);
                a aVar3 = a.this;
                iH = aVar3.H(aVar3.D0);
            }
            a aVar4 = a.this;
            Message messageE = aVar4.E(2, aVar4.B, iH, message.obj);
            if (a.this.T) {
                a.this.f60371h0.sendMessageDelayed(messageE, i13 * 2);
            } else {
                a.this.f60369g0.sendMessageDelayed(messageE, i13 * 2);
            }
        }
    }

    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 == 2) {
                a.this.W(message.arg1, message.arg2, message.obj);
            } else {
                if (i11 != 3) {
                    return;
                }
                a.this.requestLayout();
            }
        }
    }

    public interface c {
        void a(a aVar, int i11);
    }

    public interface d {
        void a(a aVar, int i11, int i12);
    }

    public interface e {
        void a(a aVar, int i11, int i12);
    }

    public interface f {
    }

    public a(Context context) {
        super(context);
        this.f60356a = -13421773;
        this.f60358b = -695533;
        this.f60360c = -695533;
        this.f60362d = 0;
        this.f60364e = 0;
        this.f60366f = 0;
        this.f60368g = 0;
        this.f60370h = 0;
        this.f60372i = 0;
        this.f60374j = 0;
        this.f60376k = 0;
        this.f60378l = 0;
        this.f60380m = -695533;
        this.f60382n = 2;
        this.f60384o = 0;
        this.f60386p = 0;
        this.f60388q = 3;
        this.f60390r = 0;
        this.f60392s = 0;
        this.f60394t = -1;
        this.f60396u = -1;
        this.f60398v = 0;
        this.f60400w = 0;
        this.f60402x = 0;
        this.f60404y = 0;
        this.f60406z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 150;
        this.D = 8;
        this.I = 1.0f;
        this.J = BitmapDescriptorFactory.HUE_RED;
        this.K = BitmapDescriptorFactory.HUE_RED;
        this.L = BitmapDescriptorFactory.HUE_RED;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = true;
        this.W = new Paint();
        this.f60357a0 = new TextPaint();
        this.f60359b0 = new Paint();
        this.f60373i0 = new ConcurrentHashMap();
        this.f60381m0 = 0;
        this.f60391r0 = BitmapDescriptorFactory.HUE_RED;
        this.f60393s0 = BitmapDescriptorFactory.HUE_RED;
        this.f60395t0 = BitmapDescriptorFactory.HUE_RED;
        this.f60397u0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        J(context);
    }

    private float A(float f11, float f12, float f13) {
        return f12 + ((f13 - f12) * f11);
    }

    private int B(int i11, int i12, boolean z11) {
        if (i12 <= 0) {
            return 0;
        }
        if (!z11) {
            return i11;
        }
        int i13 = i11 % i12;
        return i13 < 0 ? i13 + i12 : i13;
    }

    private int C(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int iMax = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                iMax = Math.max(G(charSequence, paint), iMax);
            }
        }
        return iMax;
    }

    private Message D(int i11) {
        return E(i11, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message E(int i11, int i12, int i13, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i11;
        messageObtain.arg1 = i12;
        messageObtain.arg2 = i13;
        messageObtain.obj = obj;
        return messageObtain;
    }

    private float F(Paint.FontMetrics fontMetrics) {
        return fontMetrics == null ? BitmapDescriptorFactory.HUE_RED : Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    private int G(CharSequence charSequence, Paint paint) {
        Integer num;
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String string = charSequence.toString();
        if (this.f60373i0.containsKey(string) && (num = this.f60373i0.get(string)) != null) {
            return num.intValue();
        }
        int iMeasureText = (int) (paint.measureText(string) + 0.5f);
        this.f60373i0.put(string, Integer.valueOf(iMeasureText));
        return iMeasureText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H(int i11) {
        int i12 = this.f60403x0;
        boolean z11 = false;
        if (i12 == 0) {
            return 0;
        }
        int i13 = (i11 / i12) + (this.f60388q / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.N && this.Q) {
            z11 = true;
        }
        int iB = B(i13, oneRecycleSize, z11);
        return (iB < 0 || iB >= getOneRecycleSize()) ? getOneRecycleSize() - 1 : iB + this.f60394t;
    }

    private void I() {
        if (this.f60361c0 == null) {
            this.f60361c0 = new String[]{""};
        }
    }

    private void J(Context context) {
        this.U = new Scroller(context);
        this.C = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f60362d == 0) {
            this.f60362d = b0(context, 14.0f);
        }
        if (this.f60364e == 0) {
            this.f60364e = b0(context, 16.0f);
        }
        if (this.f60366f == 0) {
            this.f60366f = b0(context, 14.0f);
        }
        if (this.f60372i == 0) {
            this.f60372i = v(context, 8.0f);
        }
        if (this.f60374j == 0) {
            this.f60374j = v(context, 8.0f);
        }
        this.W.setColor(this.f60380m);
        this.W.setAntiAlias(true);
        this.W.setStyle(Paint.Style.STROKE);
        this.W.setStrokeWidth(this.f60382n);
        this.f60357a0.setColor(this.f60356a);
        this.f60357a0.setAntiAlias(true);
        this.f60357a0.setTextAlign(Paint.Align.RIGHT);
        this.f60359b0.setColor(this.f60360c);
        this.f60359b0.setAntiAlias(true);
        this.f60359b0.setTextAlign(Paint.Align.CENTER);
        this.f60359b0.setTextSize(this.f60366f);
        int i11 = this.f60388q;
        if (i11 % 2 == 0) {
            this.f60388q = i11 + 1;
        }
        if (this.f60394t == -1 || this.f60396u == -1) {
            m0();
        }
        L();
    }

    private void K(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dc.b.f60410a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == dc.b.f60429t) {
                this.f60388q = typedArrayObtainStyledAttributes.getInt(index, 3);
            } else if (index == dc.b.f60414e) {
                this.f60380m = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == dc.b.f60415f) {
                this.f60382n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == dc.b.f60416g) {
                this.f60384o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == dc.b.f60417h) {
                this.f60386p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == dc.b.f60430u) {
                this.f60361c0 = t(typedArrayObtainStyledAttributes.getTextArray(index));
            } else if (index == dc.b.f60432w) {
                this.f60356a = typedArrayObtainStyledAttributes.getColor(index, -13421773);
            } else if (index == dc.b.f60433x) {
                this.f60358b = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == dc.b.f60431v) {
                this.f60360c = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == dc.b.A) {
                this.f60362d = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b0(context, 14.0f));
            } else if (index == dc.b.B) {
                this.f60364e = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b0(context, 16.0f));
            } else if (index == dc.b.f60435z) {
                this.f60366f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b0(context, 14.0f));
            } else if (index == dc.b.f60425p) {
                this.f60394t = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == dc.b.f60424o) {
                this.f60396u = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == dc.b.C) {
                this.N = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == dc.b.f60428s) {
                this.M = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == dc.b.f60419j) {
                this.E = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == dc.b.f60411b) {
                this.H = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == dc.b.f60418i) {
                this.G = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == dc.b.f60423n) {
                this.f60372i = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, v(context, 8.0f));
            } else if (index == dc.b.f60422m) {
                this.f60374j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, v(context, 8.0f));
            } else if (index == dc.b.f60421l) {
                this.f60376k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, v(context, 2.0f));
            } else if (index == dc.b.f60420k) {
                this.f60378l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, v(context, 5.0f));
            } else if (index == dc.b.f60412c) {
                this.f60363d0 = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == dc.b.f60413d) {
                this.f60365e0 = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == dc.b.f60427r) {
                this.S = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == dc.b.f60426q) {
                this.T = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == dc.b.f60434y) {
                this.F = typedArrayObtainStyledAttributes.getString(index);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void L() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.f60367f0 = handlerThread;
        handlerThread.start();
        this.f60369g0 = new HandlerC1227a(this.f60367f0.getLooper());
        this.f60371h0 = new b();
    }

    private void M() {
        if (this.f60367f0.isAlive()) {
            return;
        }
        L();
    }

    private void N() {
        u(getPickedIndexRelativeToRaw() - this.f60394t, false);
        this.N = false;
        postInvalidate();
    }

    private boolean P(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private int Q(int i11) {
        if (!this.N || !this.Q) {
            int i12 = this.f60389q0;
            if (i11 < i12) {
                return i12;
            }
            int i13 = this.f60387p0;
            if (i11 > i13) {
                return i13;
            }
        }
        return i11;
    }

    private int R(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        this.F0 = mode;
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f60388q * (this.f60404y + (this.f60376k * 2)));
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    private int S(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        this.E0 = mode;
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            return size;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f60406z, Math.max(this.f60402x, this.A) + (((Math.max(this.f60368g, this.f60370h) != 0 ? this.f60372i : 0) + Math.max(this.f60368g, this.f60370h) + (Math.max(this.f60368g, this.f60370h) == 0 ? 0 : this.f60374j) + (this.f60378l * 2)) * 2));
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i11) {
        if (this.f60381m0 == i11) {
            return;
        }
        this.f60381m0 = i11;
        c cVar = this.f60377k0;
        if (cVar != null) {
            cVar.a(this, i11);
        }
    }

    private int U(int i11, int i12, int i13, boolean z11) {
        if (z11) {
            if (i11 > i13) {
                return (((i11 - i13) % getOneRecycleSize()) + i12) - 1;
            }
            if (i11 < i12) {
                return ((i11 - i12) % getOneRecycleSize()) + i13 + 1;
            }
        } else {
            if (i11 > i13) {
                return i13;
            }
            if (i11 < i12) {
                return i12;
            }
        }
        return i11;
    }

    private void V() {
        VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.V.recycle();
            this.V = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i11, int i12, Object obj) {
        d dVar;
        T(0);
        if (i11 != i12) {
            if ((obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (dVar = this.f60375j0) != null) {
                int i13 = this.f60398v;
                dVar.a(this, i11 + i13, i13 + i12);
            }
            this.B = i12;
        }
        if (this.R) {
            this.R = false;
            N();
        }
    }

    private void X(int i11, int i12) {
        this.f60379l0.a(this, i11, i12);
    }

    private void Y(int i11) {
        Z(i11, true);
    }

    private void Z(int i11, boolean z11) {
        int pickedIndexRelativeToRaw;
        int pickedIndexRelativeToRaw2;
        int i12;
        int i13;
        M();
        if ((!this.N || !this.Q) && ((pickedIndexRelativeToRaw2 = (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw()) + i11) > (i12 = this.f60396u) || pickedIndexRelativeToRaw2 < (i12 = this.f60394t))) {
            i11 = i12 - pickedIndexRelativeToRaw;
        }
        int i14 = this.C0;
        int i15 = this.f60403x0;
        if (i14 < (-i15) / 2) {
            int i16 = i15 + i14;
            int i17 = (int) (((i14 + i15) * 300.0f) / i15);
            i13 = i11 < 0 ? (-i17) - (i11 * 300) : i17 + (i11 * 300);
            i14 = i16;
        } else {
            int i18 = (int) (((-i14) * 300.0f) / i15);
            i13 = i11 < 0 ? i18 - (i11 * 300) : i18 + (i11 * 300);
        }
        int i19 = i14 + (i11 * i15);
        if (i13 < 300) {
            i13 = 300;
        }
        int i21 = i13 > 600 ? 600 : i13;
        this.U.startScroll(0, this.D0, 0, i19, i21);
        if (z11) {
            this.f60369g0.sendMessageDelayed(D(1), i21 / 4);
        } else {
            this.f60369g0.sendMessageDelayed(E(1, 0, 0, new Boolean(z11)), i21 / 4);
        }
        postInvalidate();
    }

    private int b0(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private void c0() {
        Handler handler = this.f60369g0;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    private void e0(String[] strArr) {
        this.f60361c0 = strArr;
        n0();
    }

    private void f0() {
        int i11 = this.f60388q;
        int i12 = i11 / 2;
        this.f60390r = i12;
        int i13 = i12 + 1;
        this.f60392s = i13;
        int i14 = this.f60401w0;
        this.f60405y0 = (i12 * i14) / i11;
        this.f60407z0 = (i13 * i14) / i11;
        if (this.f60384o < 0) {
            this.f60384o = 0;
        }
        if (this.f60386p < 0) {
            this.f60386p = 0;
        }
        if (this.f60384o + this.f60386p != 0 && getPaddingLeft() + this.f60384o >= (this.f60399v0 - getPaddingRight()) - this.f60386p) {
            int paddingLeft = getPaddingLeft() + this.f60384o + getPaddingRight();
            int i15 = this.f60386p;
            int i16 = (paddingLeft + i15) - this.f60399v0;
            int i17 = this.f60384o;
            float f11 = i16;
            int i18 = (int) (i17 - ((i17 * f11) / (i17 + i15)));
            this.f60384o = i18;
            this.f60386p = (int) (i15 - ((f11 * i15) / (i18 + i15)));
        }
    }

    private void g0() {
        int i11 = this.f60362d;
        int i12 = this.f60403x0;
        if (i11 > i12) {
            this.f60362d = i12;
        }
        if (this.f60364e > i12) {
            this.f60364e = i12;
        }
        Paint paint = this.f60359b0;
        if (paint == null) {
            throw new IllegalArgumentException("mPaintHint should not be null.");
        }
        paint.setTextSize(this.f60366f);
        this.L = F(this.f60359b0.getFontMetrics());
        this.f60368g = G(this.E, this.f60359b0);
        TextPaint textPaint = this.f60357a0;
        if (textPaint == null) {
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        textPaint.setTextSize(this.f60364e);
        this.K = F(this.f60357a0.getFontMetrics());
        this.f60357a0.setTextSize(this.f60362d);
        this.J = F(this.f60357a0.getFontMetrics());
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.F;
        str.getClass();
        switch (str) {
            case "middle":
                return TextUtils.TruncateAt.MIDDLE;
            case "end":
                return TextUtils.TruncateAt.END;
            case "start":
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    private void h0() {
        float textSize = this.f60357a0.getTextSize();
        this.f60357a0.setTextSize(this.f60364e);
        this.f60404y = (int) (((double) (this.f60357a0.getFontMetrics().bottom - this.f60357a0.getFontMetrics().top)) + 0.5d);
        this.f60357a0.setTextSize(textSize);
    }

    private void i0(boolean z11) {
        j0();
        h0();
        if (z11) {
            if (this.E0 == Integer.MIN_VALUE || this.F0 == Integer.MIN_VALUE) {
                this.f60371h0.sendEmptyMessage(3);
            }
        }
    }

    private void j0() {
        float textSize = this.f60357a0.getTextSize();
        this.f60357a0.setTextSize(this.f60364e);
        this.f60402x = C(this.f60361c0, this.f60357a0);
        this.f60406z = C(this.f60363d0, this.f60357a0);
        this.A = C(this.f60365e0, this.f60357a0);
        this.f60357a0.setTextSize(this.f60366f);
        this.f60370h = G(this.H, this.f60357a0);
        this.f60357a0.setTextSize(textSize);
    }

    private void k0() {
        this.f60387p0 = 0;
        this.f60389q0 = (-this.f60388q) * this.f60403x0;
        if (this.f60361c0 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i11 = this.f60388q;
            int i12 = this.f60403x0;
            this.f60387p0 = ((oneRecycleSize - (i11 / 2)) - 1) * i12;
            this.f60389q0 = (-(i11 / 2)) * i12;
        }
    }

    private void l0() {
        I();
        n0();
        this.f60394t = 0;
        this.f60396u = this.f60361c0.length - 1;
    }

    private void m0() {
        I();
        n0();
        if (this.f60394t == -1) {
            this.f60394t = 0;
        }
        if (this.f60396u == -1) {
            this.f60396u = this.f60361c0.length - 1;
        }
        setMinAndMaxShowIndex(this.f60394t, this.f60396u, false);
    }

    private void n0() {
        this.Q = this.f60361c0.length > this.f60388q;
    }

    private void q() {
        int iFloor = (int) Math.floor(this.D0 / this.f60403x0);
        this.B0 = iFloor;
        int i11 = this.D0;
        int i12 = this.f60403x0;
        int i13 = -(i11 - (iFloor * i12));
        this.C0 = i13;
        if (this.f60379l0 != null) {
            if ((-i13) > i12 / 2) {
                this.f60385o0 = iFloor + 1 + (this.f60388q / 2);
            } else {
                this.f60385o0 = iFloor + (this.f60388q / 2);
            }
            int oneRecycleSize = this.f60385o0 % getOneRecycleSize();
            this.f60385o0 = oneRecycleSize;
            if (oneRecycleSize < 0) {
                this.f60385o0 = oneRecycleSize + getOneRecycleSize();
            }
            int i14 = this.f60383n0;
            int i15 = this.f60385o0;
            if (i14 != i15) {
                int i16 = this.f60398v;
                X(i14 + i16, i15 + i16);
            }
            this.f60383n0 = this.f60385o0;
        }
    }

    private void r(MotionEvent motionEvent) {
        float y11 = motionEvent.getY();
        for (int i11 = 0; i11 < this.f60388q; i11++) {
            int i12 = this.f60403x0;
            if (i12 * i11 <= y11 && y11 < i12 * (i11 + 1)) {
                s(i11);
                return;
            }
        }
    }

    private void s(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f60388q)) {
            return;
        }
        Y(i11 - (i12 / 2));
    }

    private String[] t(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            strArr[i11] = charSequenceArr[i11].toString();
        }
        return strArr;
    }

    private void u(int i11, boolean z11) {
        int i12 = i11 - ((this.f60388q - 1) / 2);
        this.B0 = i12;
        int iB = B(i12, getOneRecycleSize(), z11);
        this.B0 = iB;
        int i13 = this.f60403x0;
        if (i13 == 0) {
            this.O = true;
            return;
        }
        this.D0 = i13 * iB;
        int i14 = iB + (this.f60388q / 2);
        this.f60383n0 = i14;
        int oneRecycleSize = i14 % getOneRecycleSize();
        this.f60383n0 = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.f60383n0 = oneRecycleSize + getOneRecycleSize();
        }
        this.f60385o0 = this.f60383n0;
        q();
    }

    private int v(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void w(Canvas canvas) {
        float fA;
        float fA2;
        float f11;
        int iZ;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        int i11 = 0;
        while (i11 < this.f60388q + 1) {
            float f13 = this.C0 + (this.f60403x0 * i11);
            int iB = B(this.B0 + i11, getOneRecycleSize(), this.N && this.Q);
            int i12 = this.f60388q;
            if (i11 == i12 / 2) {
                int i13 = this.f60403x0;
                f11 = (this.C0 + i13) / i13;
                iZ = z(f11, this.f60356a, this.f60358b);
                fA = A(f11, this.f60362d, this.f60364e);
                fA2 = A(f11, this.J, this.K);
            } else if (i11 == (i12 / 2) + 1) {
                float f14 = 1.0f - f12;
                int iZ2 = z(f14, this.f60356a, this.f60358b);
                float fA3 = A(f14, this.f60362d, this.f60364e);
                float fA4 = A(f14, this.J, this.K);
                f11 = f12;
                iZ = iZ2;
                fA = fA3;
                fA2 = fA4;
            } else {
                int i14 = this.f60356a;
                fA = this.f60362d;
                fA2 = this.J;
                f11 = f12;
                iZ = i14;
            }
            this.f60357a0.setColor(iZ);
            this.f60357a0.setTextSize(fA);
            if (iB >= 0 && iB < getOneRecycleSize()) {
                CharSequence charSequenceEllipsize = this.f60361c0[iB + this.f60394t];
                if (this.F != null) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f60357a0, getWidth() - (this.f60378l * 2), getEllipsizeType());
                }
                canvas.drawText(charSequenceEllipsize.toString(), this.f60357a0.getTextAlign() == Paint.Align.RIGHT ? this.f60399v0 - (this.f60378l * 2) : this.f60378l * 2, f13 + (this.f60403x0 / 2) + fA2, this.f60357a0);
            } else if (!TextUtils.isEmpty(this.G)) {
                canvas.drawText(this.G, this.A0, f13 + (this.f60403x0 / 2) + fA2, this.f60357a0);
            }
            i11++;
            f12 = f11;
        }
    }

    private void x(Canvas canvas) {
        if (TextUtils.isEmpty(this.E)) {
            return;
        }
        canvas.drawText(this.E, this.A0 + ((this.f60402x + this.f60368g) / 2) + this.f60372i, ((this.f60405y0 + this.f60407z0) / 2.0f) + this.L, this.f60359b0);
    }

    private void y(Canvas canvas) {
        if (this.M) {
            canvas.drawLine(getPaddingLeft() + this.f60384o, this.f60405y0, (this.f60399v0 - getPaddingRight()) - this.f60386p, this.f60405y0, this.W);
            canvas.drawLine(getPaddingLeft() + this.f60384o, this.f60407z0, (this.f60399v0 - getPaddingRight()) - this.f60386p, this.f60407z0, this.W);
        }
    }

    private int z(float f11, int i11, int i12) {
        int i13 = (i11 & (-16777216)) >>> 24;
        int i14 = (i11 & 16711680) >>> 16;
        int i15 = (i11 & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >>> 8;
        int i16 = i11 & 255;
        return ((int) (i16 + (((i12 & 255) - i16) * f11))) | (((int) (i13 + (((((-16777216) & i12) >>> 24) - i13) * f11))) << 24) | (((int) (i14 + ((((16711680 & i12) >>> 16) - i14) * f11))) << 16) | (((int) (i15 + ((((65280 & i12) >>> 8) - i15) * f11))) << 8);
    }

    public boolean O() {
        return this.f60381m0 == 2;
    }

    public void a0(int i11, int i12, boolean z11) {
        int i13;
        boolean z12 = false;
        int iU = U(i11, this.f60398v, this.f60400w, this.N && this.Q);
        int i14 = this.f60398v;
        int i15 = this.f60400w;
        if (this.N && this.Q) {
            z12 = true;
        }
        int iU2 = U(i12, i14, i15, z12);
        if (this.N && this.Q) {
            i13 = iU2 - iU;
            int oneRecycleSize = getOneRecycleSize() / 2;
            if (i13 < (-oneRecycleSize) || oneRecycleSize < i13) {
                int oneRecycleSize2 = getOneRecycleSize();
                i13 = i13 > 0 ? i13 - oneRecycleSize2 : i13 + oneRecycleSize2;
            }
        } else {
            i13 = iU2 - iU;
        }
        setValue(iU);
        if (iU == iU2) {
            return;
        }
        Z(i13, z11);
    }

    public void b(int i11, boolean z11) {
        a0(getValue(), i11, z11);
    }

    public void c(int i11) {
        a0(getValue(), i11, true);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f60403x0 != 0 && this.U.computeScrollOffset()) {
            this.D0 = this.U.getCurrY();
            q();
            postInvalidate();
        }
    }

    public void d0() {
        Scroller scroller = this.U;
        if (scroller == null || scroller.isFinished()) {
            return;
        }
        Scroller scroller2 = this.U;
        scroller2.startScroll(0, scroller2.getCurrY(), 0, 0, 1);
        this.U.abortAnimation();
        postInvalidate();
    }

    public String getContentByCurrValue() {
        return this.f60361c0[getValue() - this.f60398v];
    }

    public String[] getDisplayedValues() {
        return this.f60361c0;
    }

    public int getMaxValue() {
        return this.f60400w;
    }

    public int getMinValue() {
        return this.f60398v;
    }

    public int getOneRecycleSize() {
        return (this.f60396u - this.f60394t) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i11 = this.C0;
        if (i11 == 0) {
            return H(this.D0);
        }
        int i12 = this.f60403x0;
        return i11 < (-i12) / 2 ? H(this.D0 + i12 + i11) : H(this.D0 + i11);
    }

    public int getRawContentSize() {
        String[] strArr = this.f60361c0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f60398v;
    }

    public boolean getWrapSelectorWheel() {
        return this.N;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.N && this.Q;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.f60367f0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            L();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f60367f0.quit();
        if (this.f60403x0 == 0) {
            return;
        }
        if (!this.U.isFinished()) {
            this.U.abortAnimation();
            this.D0 = this.U.getCurrY();
            q();
            int i11 = this.C0;
            if (i11 != 0) {
                int i12 = this.f60403x0;
                if (i11 < (-i12) / 2) {
                    this.D0 = this.D0 + i12 + i11;
                } else {
                    this.D0 += i11;
                }
                q();
            }
            T(0);
        }
        int iH = H(this.D0);
        int i13 = this.B;
        if (iH != i13 && this.S) {
            try {
                d dVar = this.f60375j0;
                if (dVar != null) {
                    int i14 = this.f60398v;
                    dVar.a(this, i13 + i14, i14 + iH);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.B = iH;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w(canvas);
        y(canvas);
        x(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        i0(false);
        setMeasuredDimension(S(i11), R(i12));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        int value;
        super.onSizeChanged(i11, i12, i13, i14);
        this.f60399v0 = i11;
        this.f60401w0 = i12;
        this.f60403x0 = i12 / this.f60388q;
        this.A0 = ((i11 + getPaddingLeft()) - getPaddingRight()) / 2.0f;
        boolean z11 = false;
        if (getOneRecycleSize() <= 1) {
            value = 0;
        } else if (this.P) {
            value = getValue() - this.f60398v;
        } else if (this.O) {
            value = this.B0 + ((this.f60388q - 1) / 2);
        } else {
            value = 0;
        }
        if (this.N && this.Q) {
            z11 = true;
        }
        u(value, z11);
        g0();
        k0();
        f0();
        this.P = true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        M();
        if (this.f60403x0 == 0) {
            return true;
        }
        if (this.V == null) {
            this.V = VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        this.f60395t0 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f60397u0 = true;
            this.f60369g0.removeMessages(1);
            d0();
            this.f60393s0 = this.f60395t0;
            this.f60391r0 = this.D0;
            T(0);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action != 1) {
            if (action == 2) {
                float f11 = this.f60393s0 - this.f60395t0;
                if (this.f60397u0) {
                    int i11 = this.D;
                    if ((-i11) >= f11 || f11 >= i11) {
                        this.f60397u0 = false;
                        this.D0 = Q((int) (this.f60391r0 + f11));
                        q();
                        invalidate();
                    }
                } else {
                    this.f60397u0 = false;
                    this.D0 = Q((int) (this.f60391r0 + f11));
                    q();
                    invalidate();
                }
                T(1);
            } else if (action == 3) {
                this.f60391r0 = this.D0;
                d0();
                this.f60369g0.sendMessageDelayed(D(1), 0L);
            }
        } else if (this.f60397u0) {
            r(motionEvent);
        } else {
            VelocityTracker velocityTracker = this.V;
            velocityTracker.computeCurrentVelocity(1000);
            int yVelocity = (int) (velocityTracker.getYVelocity() * this.I);
            if (Math.abs(yVelocity) > this.C) {
                this.U.fling(0, this.D0, 0, -yVelocity, Integer.MIN_VALUE, Integer.MAX_VALUE, Q(Integer.MIN_VALUE), Q(Integer.MAX_VALUE));
                invalidate();
                T(2);
            }
            this.f60369g0.sendMessageDelayed(D(1), 0L);
            V();
        }
        return true;
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f60357a0.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr, boolean z11) {
        setDisplayedValuesAndPickedIndex(strArr, 0, z11);
    }

    public void setDisplayedValuesAndPickedIndex(String[] strArr, int i11, boolean z11) {
        d0();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("pickedIndex should not be negative, now pickedIndex is " + i11);
        }
        e0(strArr);
        i0(true);
        k0();
        l0();
        this.B = this.f60394t + i11;
        u(i11, this.N && this.Q);
        if (z11) {
            M();
            this.f60369g0.sendMessageDelayed(D(1), 0L);
            postInvalidate();
        }
    }

    public void setDividerColor(int i11) {
        if (this.f60380m == i11) {
            return;
        }
        this.f60380m = i11;
        this.W.setColor(i11);
        postInvalidate();
    }

    public void setDividerHeight(int i11) {
        if (this.f60382n == i11) {
            return;
        }
        this.f60382n = i11;
        this.W.setStrokeWidth(i11);
        postInvalidate();
    }

    public void setFriction(float f11) {
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            ViewConfiguration.get(getContext());
            this.I = ViewConfiguration.getScrollFriction() / f11;
        } else {
            throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f11);
        }
    }

    public void setHintText(String str) {
        if (P(this.E, str)) {
            return;
        }
        this.E = str;
        this.L = F(this.f60359b0.getFontMetrics());
        this.f60368g = G(this.E, this.f60359b0);
        this.f60371h0.sendEmptyMessage(3);
    }

    public void setHintTextColor(int i11) {
        if (this.f60360c == i11) {
            return;
        }
        this.f60360c = i11;
        this.f60359b0.setColor(i11);
        postInvalidate();
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f60359b0.setTypeface(typeface);
    }

    public void setItemPaddingHorizontal(int i11) {
        this.f60378l = i11;
        postInvalidate();
    }

    public void setMaxValue(int i11) {
        String[] strArr = this.f60361c0;
        if (strArr == null) {
            throw new NullPointerException("mDisplayedValues should not be null");
        }
        int i12 = this.f60398v;
        if ((i11 - i12) + 1 > strArr.length) {
            throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i11 - this.f60398v) + 1) + " and mDisplayedValues.length is " + this.f60361c0.length);
        }
        this.f60400w = i11;
        int i13 = this.f60394t;
        int i14 = (i11 - i12) + i13;
        this.f60396u = i14;
        setMinAndMaxShowIndex(i13, i14);
        k0();
    }

    public void setMinAndMaxShowIndex(int i11, int i12) {
        setMinAndMaxShowIndex(i11, i12, true);
    }

    public void setMinValue(int i11) {
        this.f60398v = i11;
        this.f60394t = 0;
        k0();
    }

    public void setNormalTextColor(int i11) {
        if (this.f60356a == i11) {
            return;
        }
        this.f60356a = i11;
        postInvalidate();
    }

    public void setOnScrollListener(c cVar) {
        this.f60377k0 = cVar;
    }

    public void setOnValueChangeListenerInScrolling(e eVar) {
        this.f60379l0 = eVar;
    }

    public void setOnValueChangedListener(d dVar) {
        this.f60375j0 = dVar;
    }

    public void setPickedIndexRelativeToMin(int i11) {
        if (i11 < 0 || i11 >= getOneRecycleSize()) {
            return;
        }
        this.B = this.f60394t + i11;
        u(i11, this.N && this.Q);
        postInvalidate();
    }

    public void setPickedIndexRelativeToRaw(int i11) {
        int i12 = this.f60394t;
        if (i12 <= -1 || i12 > i11 || i11 > this.f60396u) {
            return;
        }
        this.B = i11;
        u(i11 - i12, this.N && this.Q);
        postInvalidate();
    }

    public void setSelectedTextColor(int i11) {
        if (this.f60358b == i11) {
            return;
        }
        this.f60358b = i11;
        postInvalidate();
    }

    public void setShownCount(int i11) {
        this.f60388q = i11;
    }

    public void setTextAlign(Paint.Align align) {
        this.f60357a0.setTextAlign(align);
    }

    public void setValue(int i11) {
        int i12 = this.f60398v;
        if (i11 < i12) {
            throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i11);
        }
        if (i11 <= this.f60400w) {
            setPickedIndexRelativeToRaw(i11 - i12);
            return;
        }
        throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i11);
    }

    public void setWrapSelectorWheel(boolean z11) {
        if (this.N != z11) {
            if (z11) {
                this.N = z11;
                n0();
                postInvalidate();
            } else if (this.f60381m0 == 0) {
                N();
            } else {
                this.R = true;
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        c0();
        d0();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if ((this.f60400w - this.f60398v) + 1 <= strArr.length) {
            e0(strArr);
            i0(true);
            this.B = this.f60394t;
            u(0, this.N && this.Q);
            postInvalidate();
            this.f60371h0.sendEmptyMessage(3);
            return;
        }
        throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.f60400w - this.f60398v) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
    }

    public void setMinAndMaxShowIndex(int i11, int i12, boolean z11) {
        if (i11 > i12) {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i11 + ", maxShowIndex is " + i12 + ".");
        }
        String[] strArr = this.f60361c0;
        if (strArr == null) {
            throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i11);
        }
        if (i11 > strArr.length - 1) {
            throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f60361c0.length - 1) + " minShowIndex is " + i11);
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i12);
        }
        if (i12 > strArr.length - 1) {
            throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f60361c0.length - 1) + " maxShowIndex is " + i12);
        }
        this.f60394t = i11;
        this.f60396u = i12;
        if (z11) {
            this.B = i11;
            u(0, this.N && this.Q);
            postInvalidate();
        }
    }

    public void setOnValueChangedListenerRelativeToRaw(f fVar) {
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60356a = -13421773;
        this.f60358b = -695533;
        this.f60360c = -695533;
        this.f60362d = 0;
        this.f60364e = 0;
        this.f60366f = 0;
        this.f60368g = 0;
        this.f60370h = 0;
        this.f60372i = 0;
        this.f60374j = 0;
        this.f60376k = 0;
        this.f60378l = 0;
        this.f60380m = -695533;
        this.f60382n = 2;
        this.f60384o = 0;
        this.f60386p = 0;
        this.f60388q = 3;
        this.f60390r = 0;
        this.f60392s = 0;
        this.f60394t = -1;
        this.f60396u = -1;
        this.f60398v = 0;
        this.f60400w = 0;
        this.f60402x = 0;
        this.f60404y = 0;
        this.f60406z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 150;
        this.D = 8;
        this.I = 1.0f;
        this.J = BitmapDescriptorFactory.HUE_RED;
        this.K = BitmapDescriptorFactory.HUE_RED;
        this.L = BitmapDescriptorFactory.HUE_RED;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = true;
        this.W = new Paint();
        this.f60357a0 = new TextPaint();
        this.f60359b0 = new Paint();
        this.f60373i0 = new ConcurrentHashMap();
        this.f60381m0 = 0;
        this.f60391r0 = BitmapDescriptorFactory.HUE_RED;
        this.f60393s0 = BitmapDescriptorFactory.HUE_RED;
        this.f60395t0 = BitmapDescriptorFactory.HUE_RED;
        this.f60397u0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        K(context, attributeSet);
        J(context);
    }

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f60356a = -13421773;
        this.f60358b = -695533;
        this.f60360c = -695533;
        this.f60362d = 0;
        this.f60364e = 0;
        this.f60366f = 0;
        this.f60368g = 0;
        this.f60370h = 0;
        this.f60372i = 0;
        this.f60374j = 0;
        this.f60376k = 0;
        this.f60378l = 0;
        this.f60380m = -695533;
        this.f60382n = 2;
        this.f60384o = 0;
        this.f60386p = 0;
        this.f60388q = 3;
        this.f60390r = 0;
        this.f60392s = 0;
        this.f60394t = -1;
        this.f60396u = -1;
        this.f60398v = 0;
        this.f60400w = 0;
        this.f60402x = 0;
        this.f60404y = 0;
        this.f60406z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 150;
        this.D = 8;
        this.I = 1.0f;
        this.J = BitmapDescriptorFactory.HUE_RED;
        this.K = BitmapDescriptorFactory.HUE_RED;
        this.L = BitmapDescriptorFactory.HUE_RED;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = true;
        this.W = new Paint();
        this.f60357a0 = new TextPaint();
        this.f60359b0 = new Paint();
        this.f60373i0 = new ConcurrentHashMap();
        this.f60381m0 = 0;
        this.f60391r0 = BitmapDescriptorFactory.HUE_RED;
        this.f60393s0 = BitmapDescriptorFactory.HUE_RED;
        this.f60395t0 = BitmapDescriptorFactory.HUE_RED;
        this.f60397u0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        K(context, attributeSet);
        J(context);
    }
}
