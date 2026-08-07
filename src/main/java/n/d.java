package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.j0;
import androidx.core.view.s;
import ezvcard.property.Kind;
import i.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class<?>[] f92579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class<?>[] f92580f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f92581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f92582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f92583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f92584d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f92585c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f92586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f92587b;

        public a(Object obj, String str) {
            this.f92586a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f92587b = cls.getMethod(str, f92585c);
            } catch (Exception e11) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e11);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f92587b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f92587b.invoke(this.f92586a, menuItem)).booleanValue();
                }
                this.f92587b.invoke(this.f92586a, menuItem);
                return true;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f92588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f92589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f92590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f92591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f92592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f92593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f92594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f92595h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f92596i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f92597j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f92598k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f92599l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f92600m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f92601n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f92602o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f92603p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f92604q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f92605r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f92606s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f92607t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f92608u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f92609v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f92610w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f92611x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f92612y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f92613z;

        public b(Menu menu) {
            this.f92588a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, d.this.f92583c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e11) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e11);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z11 = false;
            menuItem.setChecked(this.f92606s).setVisible(this.f92607t).setEnabled(this.f92608u).setCheckable(this.f92605r >= 1).setTitleCondensed(this.f92599l).setIcon(this.f92600m);
            int i11 = this.f92609v;
            if (i11 >= 0) {
                menuItem.setShowAsAction(i11);
            }
            if (this.f92613z != null) {
                if (d.this.f92583c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(d.this.b(), this.f92613z));
            }
            if (this.f92605r >= 2) {
                if (menuItem instanceof g) {
                    ((g) menuItem).t(true);
                } else if (menuItem instanceof o.c) {
                    ((o.c) menuItem).h(true);
                }
            }
            String str = this.f92611x;
            if (str != null) {
                menuItem.setActionView((View) e(str, d.f92579e, d.this.f92581a));
                z11 = true;
            }
            int i12 = this.f92610w;
            if (i12 > 0) {
                if (z11) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i12);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                s.a(menuItem, bVar);
            }
            s.c(menuItem, this.B);
            s.g(menuItem, this.C);
            s.b(menuItem, this.f92601n, this.f92602o);
            s.f(menuItem, this.f92603p, this.f92604q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                s.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                s.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f92595h = true;
            i(this.f92588a.add(this.f92589b, this.f92596i, this.f92597j, this.f92598k));
        }

        public SubMenu b() {
            this.f92595h = true;
            SubMenu subMenuAddSubMenu = this.f92588a.addSubMenu(this.f92589b, this.f92596i, this.f92597j, this.f92598k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f92595h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = d.this.f92583c.obtainStyledAttributes(attributeSet, j.f73997z1);
            this.f92589b = typedArrayObtainStyledAttributes.getResourceId(j.B1, 0);
            this.f92590c = typedArrayObtainStyledAttributes.getInt(j.D1, 0);
            this.f92591d = typedArrayObtainStyledAttributes.getInt(j.E1, 0);
            this.f92592e = typedArrayObtainStyledAttributes.getInt(j.F1, 0);
            this.f92593f = typedArrayObtainStyledAttributes.getBoolean(j.C1, true);
            this.f92594g = typedArrayObtainStyledAttributes.getBoolean(j.A1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            b1 b1VarU = b1.u(d.this.f92583c, attributeSet, j.G1);
            this.f92596i = b1VarU.n(j.J1, 0);
            this.f92597j = (b1VarU.k(j.M1, this.f92590c) & (-65536)) | (b1VarU.k(j.N1, this.f92591d) & 65535);
            this.f92598k = b1VarU.p(j.O1);
            this.f92599l = b1VarU.p(j.P1);
            this.f92600m = b1VarU.n(j.H1, 0);
            this.f92601n = c(b1VarU.o(j.Q1));
            this.f92602o = b1VarU.k(j.X1, 4096);
            this.f92603p = c(b1VarU.o(j.R1));
            this.f92604q = b1VarU.k(j.f73874b2, 4096);
            if (b1VarU.s(j.S1)) {
                this.f92605r = b1VarU.a(j.S1, false) ? 1 : 0;
            } else {
                this.f92605r = this.f92592e;
            }
            this.f92606s = b1VarU.a(j.K1, false);
            this.f92607t = b1VarU.a(j.L1, this.f92593f);
            this.f92608u = b1VarU.a(j.I1, this.f92594g);
            this.f92609v = b1VarU.k(j.f73880c2, -1);
            this.f92613z = b1VarU.o(j.T1);
            this.f92610w = b1VarU.n(j.U1, 0);
            this.f92611x = b1VarU.o(j.W1);
            String strO = b1VarU.o(j.V1);
            this.f92612y = strO;
            boolean z11 = strO != null;
            if (z11 && this.f92610w == 0 && this.f92611x == null) {
                this.A = (androidx.core.view.b) e(strO, d.f92580f, d.this.f92582b);
            } else {
                if (z11) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = b1VarU.p(j.Y1);
            this.C = b1VarU.p(j.f73886d2);
            if (b1VarU.s(j.f73868a2)) {
                this.E = j0.d(b1VarU.k(j.f73868a2, -1), this.E);
            } else {
                this.E = null;
            }
            if (b1VarU.s(j.Z1)) {
                this.D = b1VarU.c(j.Z1);
            } else {
                this.D = null;
            }
            b1VarU.w();
            this.f92595h = false;
        }

        public void h() {
            this.f92589b = 0;
            this.f92590c = 0;
            this.f92591d = 0;
            this.f92592e = 0;
            this.f92593f = true;
            this.f92594g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f92579e = clsArr;
        f92580f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f92583c = context;
        Object[] objArr = {context};
        this.f92581a = objArr;
        this.f92582b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z12 && name2.equals(str)) {
                        z12 = false;
                        str = null;
                    } else if (name2.equals(Kind.GROUP)) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z11 = true;
                    }
                }
            } else if (!z12) {
                String name3 = xmlPullParser.getName();
                if (name3.equals(Kind.GROUP)) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z12 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f92584d == null) {
            this.f92584d = a(this.f92583c);
        }
        return this.f92584d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i11, Menu menu) {
        if (!(menu instanceof m5.a)) {
            super.inflate(i11, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f92583c.getResources().getLayout(i11);
                    c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e11) {
                    throw new InflateException("Error inflating menu XML", e11);
                }
            } catch (XmlPullParserException e12) {
                throw new InflateException("Error inflating menu XML", e12);
            }
        } catch (Throwable th2) {
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
