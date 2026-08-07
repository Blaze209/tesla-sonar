package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.n0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h f1963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f1964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f1967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f1968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f1969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1974m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f1976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f1977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f1978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f1979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f1980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f1981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f1982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f1983v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f1984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f1985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f1986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f1987z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1975n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1989b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z11, boolean z12) {
            if (z12 && z11) {
                return;
            }
            setPadding(getPaddingLeft(), z11 ? getPaddingTop() : this.f1988a, getPaddingRight(), z12 ? getPaddingBottom() : this.f1989b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f73938n2);
            this.f1989b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f73943o2, -1);
            this.f1988a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f73948p2, -1);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f1976o && (message3 = alertController.f1978q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f1980s || (message2 = alertController.f1982u) == null) {
                messageObtain = (view != alertController.f1984w || (message = alertController.f1986y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f1963b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f1992b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f1994d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f1996f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f1997g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f1998h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f1999i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f2000j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f2001k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f2002l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f2003m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f2004n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f2005o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f2006p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f2007q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f2009s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f2010t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f2011u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f2012v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f2013w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f2014x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f2015y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f2016z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1993c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1995e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f2008r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f2017a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i11, int i12, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i11, i12, charSequenceArr);
                this.f2017a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i11, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i11, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i11]) {
                    this.f2017a.setItemChecked(i11, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0059b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f2020b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f2021c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f2022d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0059b(Context context, Cursor cursor, boolean z11, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z11);
                this.f2021c = recycleListView;
                this.f2022d = alertController;
                Cursor cursor2 = getCursor();
                this.f2019a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f2020b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f2019a));
                this.f2021c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f2020b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f1992b.inflate(this.f2022d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f2024a;

            c(AlertController alertController) {
                this.f2024a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
                b.this.f2014x.onClick(this.f2024a.f1963b, i11);
                if (b.this.H) {
                    return;
                }
                this.f2024a.f1963b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f2026a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f2027b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f2026a = recycleListView;
                this.f2027b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i11] = this.f2026a.isItemChecked(i11);
                }
                b.this.J.onClick(this.f2027b.f1963b, i11, this.f2026a.isItemChecked(i11));
            }
        }

        public b(Context context) {
            this.f1991a = context;
            this.f1992b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f1992b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                bVar = this;
                alertController2 = alertController;
                int i11 = bVar.H ? alertController2.N : alertController2.O;
                if (bVar.K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f1991a, i11, bVar.K, new String[]{bVar.L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f2013w;
                    if (dVar == null) {
                        dVar = new d(bVar.f1991a, i11, R.id.text1, bVar.f2012v);
                    }
                }
            } else if (this.K == null) {
                bVar = this;
                dVar = bVar.new a(this.f1991a, alertController.M, R.id.text1, this.f2012v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0059b(bVar.f1991a, bVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = dVar;
            alertController2.I = bVar.I;
            if (bVar.f2014x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f1968g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f1997g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f1996f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f1994d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i11 = this.f1993c;
                if (i11 != 0) {
                    alertController.m(i11);
                }
                int i12 = this.f1995e;
                if (i12 != 0) {
                    alertController.m(alertController.d(i12));
                }
            }
            CharSequence charSequence2 = this.f1998h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f1999i;
            if (charSequence3 == null && this.f2000j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f2001k, null, this.f2000j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f2002l;
            if (charSequence4 != null || this.f2003m != null) {
                alertController2.k(-2, charSequence4, this.f2004n, null, this.f2003m);
            }
            CharSequence charSequence5 = this.f2005o;
            if (charSequence5 != null || this.f2006p != null) {
                alertController2.k(-3, charSequence5, this.f2007q, null, this.f2006p);
            }
            if (this.f2012v != null || this.K != null || this.f2013w != null) {
                b(alertController2);
            }
            View view2 = this.f2016z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i13 = this.f2015y;
            if (i13 != 0) {
                alertController2.r(i13);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f2029a;

        public c(DialogInterface dialogInterface) {
            this.f2029a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == -3 || i11 == -2 || i11 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f2029a.get(), message.what);
            } else {
                if (i11 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i11, int i12, CharSequence[] charSequenceArr) {
            super(context, i11, i12, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, h hVar, Window window) {
        this.f1962a = context;
        this.f1963b = hVar;
        this.f1964c = window;
        this.R = new c(hVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, i.j.F, i.a.f73738o, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(i.j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(i.j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(i.j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(i.j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(i.j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(i.j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(i.j.M, true);
        this.f1965d = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        hVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i11 = this.K;
        if (i11 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i11 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i11, int i12) {
        View viewFindViewById = this.f1964c.findViewById(i.f.f73822w);
        View viewFindViewById2 = this.f1964c.findViewById(i.f.f73821v);
        ViewCompat.H0(view, i11, i12);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        int i11;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f1976o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1977p) && this.f1979r == null) {
            this.f1976o.setVisibility(8);
            i11 = 0;
        } else {
            this.f1976o.setText(this.f1977p);
            Drawable drawable = this.f1979r;
            if (drawable != null) {
                int i12 = this.f1965d;
                drawable.setBounds(0, 0, i12, i12);
                this.f1976o.setCompoundDrawables(this.f1979r, null, null, null);
            }
            this.f1976o.setVisibility(0);
            i11 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f1980s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1981t) && this.f1983v == null) {
            this.f1980s.setVisibility(8);
        } else {
            this.f1980s.setText(this.f1981t);
            Drawable drawable2 = this.f1983v;
            if (drawable2 != null) {
                int i13 = this.f1965d;
                drawable2.setBounds(0, 0, i13, i13);
                this.f1980s.setCompoundDrawables(this.f1983v, null, null, null);
            }
            this.f1980s.setVisibility(0);
            i11 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f1984w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1985x) && this.f1987z == null) {
            this.f1984w.setVisibility(8);
        } else {
            this.f1984w.setText(this.f1985x);
            Drawable drawable3 = this.f1987z;
            if (drawable3 != null) {
                int i14 = this.f1965d;
                drawable3.setBounds(0, 0, i14, i14);
                this.f1984w.setCompoundDrawables(this.f1987z, null, null, null);
            }
            this.f1984w.setVisibility(0);
            i11 |= 4;
        }
        if (z(this.f1962a)) {
            if (i11 == 1) {
                b(this.f1976o);
            } else if (i11 == 2) {
                b(this.f1980s);
            } else if (i11 == 4) {
                b(this.f1984w);
            }
        }
        if (i11 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1964c.findViewById(i.f.f73823x);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f1967f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f1968g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f1968g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f1969h;
        if (viewInflate == null) {
            viewInflate = this.f1970i != 0 ? LayoutInflater.from(this.f1962a).inflate(this.f1970i, viewGroup, false) : null;
        }
        boolean z11 = viewInflate != null;
        if (!z11 || !a(viewInflate)) {
            this.f1964c.setFlags(131072, 131072);
        }
        if (!z11) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f1964c.findViewById(i.f.f73814o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f1975n) {
            frameLayout.setPadding(this.f1971j, this.f1972k, this.f1973l, this.f1974m);
        }
        if (this.f1968g != null) {
            ((LinearLayout.LayoutParams) ((n0.a) viewGroup.getLayoutParams())).weight = BitmapDescriptorFactory.HUE_RED;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1964c.findViewById(i.f.P).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f1964c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f1966e) || !this.P) {
            this.f1964c.findViewById(i.f.P).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1964c.findViewById(i.f.f73810k);
        this.E = textView;
        textView.setText(this.f1966e);
        int i11 = this.B;
        if (i11 != 0) {
            this.D.setImageResource(i11);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f1964c.findViewById(i.f.f73820u);
        View viewFindViewById4 = viewFindViewById3.findViewById(i.f.Q);
        View viewFindViewById5 = viewFindViewById3.findViewById(i.f.f73813n);
        View viewFindViewById6 = viewFindViewById3.findViewById(i.f.f73811l);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(i.f.f73815p);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i.f.Q);
        View viewFindViewById8 = viewGroup.findViewById(i.f.f73813n);
        View viewFindViewById9 = viewGroup.findViewById(i.f.f73811l);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z11 = viewGroup.getVisibility() != 8;
        boolean z12 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z13 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z13 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(i.f.L)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z12 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f1967f == null && this.f1968g == null) ? null : viewGroupI.findViewById(i.f.O);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(i.f.M)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f1968g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z12, z13);
        }
        if (!z11) {
            View view = this.f1968g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z12 | (z13 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f1968g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i11 = this.I;
        if (i11 > -1) {
            listView2.setItemChecked(i11, true);
            listView2.setSelection(i11);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f73737n, typedValue, true);
        return typedValue.data != 0;
    }

    public Button c(int i11) {
        if (i11 == -3) {
            return this.f1984w;
        }
        if (i11 == -2) {
            return this.f1980s;
        }
        if (i11 != -1) {
            return null;
        }
        return this.f1976o;
    }

    public int d(int i11) {
        TypedValue typedValue = new TypedValue();
        this.f1962a.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f1968g;
    }

    public void f() {
        this.f1963b.setContentView(j());
        y();
    }

    public boolean g(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean h(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public void k(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i11, onClickListener);
        }
        if (i11 == -3) {
            this.f1985x = charSequence;
            this.f1986y = message;
            this.f1987z = drawable;
        } else if (i11 == -2) {
            this.f1981t = charSequence;
            this.f1982u = message;
            this.f1983v = drawable;
        } else {
            if (i11 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1977p = charSequence;
            this.f1978q = message;
            this.f1979r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i11) {
        this.C = null;
        this.B = i11;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i11 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f1967f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f1966e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i11) {
        this.f1969h = null;
        this.f1970i = i11;
        this.f1975n = false;
    }

    public void s(View view) {
        this.f1969h = view;
        this.f1970i = 0;
        this.f1975n = false;
    }

    public void t(View view, int i11, int i12, int i13, int i14) {
        this.f1969h = view;
        this.f1970i = 0;
        this.f1975n = true;
        this.f1971j = i11;
        this.f1972k = i12;
        this.f1973l = i13;
        this.f1974m = i14;
    }
}
