package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class b extends h implements DialogInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AlertController f2033c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f2034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2035b;

        public a(@NonNull Context context) {
            this(context, b.g(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f2013w = listAdapter;
            bVar.f2014x = onClickListener;
            return this;
        }

        public a b(boolean z11) {
            this.f2034a.f2008r = z11;
            return this;
        }

        public a c(View view) {
            this.f2034a.f1997g = view;
            return this;
        }

        @NonNull
        public b create() {
            b bVar = new b(this.f2034a.f1991a, this.f2035b);
            this.f2034a.a(bVar.f2033c);
            bVar.setCancelable(this.f2034a.f2008r);
            if (this.f2034a.f2008r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f2034a.f2009s);
            bVar.setOnDismissListener(this.f2034a.f2010t);
            DialogInterface.OnKeyListener onKeyListener = this.f2034a.f2011u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a d(Drawable drawable) {
            this.f2034a.f1994d = drawable;
            return this;
        }

        public a e(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f2012v = charSequenceArr;
            bVar.f2014x = onClickListener;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f2034a.f1998h = charSequence;
            return this;
        }

        public a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f2002l = charSequence;
            bVar.f2004n = onClickListener;
            return this;
        }

        @NonNull
        public Context getContext() {
            return this.f2034a.f1991a;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f2005o = charSequence;
            bVar.f2007q = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnCancelListener onCancelListener) {
            this.f2034a.f2009s = onCancelListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f2034a.f2011u = onKeyListener;
            return this;
        }

        public a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f1999i = charSequence;
            bVar.f2001k = onClickListener;
            return this;
        }

        public a l(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f2013w = listAdapter;
            bVar.f2014x = onClickListener;
            bVar.I = i11;
            bVar.H = true;
            return this;
        }

        public a m(int i11) {
            AlertController.b bVar = this.f2034a;
            bVar.f1996f = bVar.f1991a.getText(i11);
            return this;
        }

        public b n() {
            b bVarCreate = create();
            bVarCreate.show();
            return bVarCreate;
        }

        public a setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f2002l = bVar.f1991a.getText(i11);
            this.f2034a.f2004n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2034a;
            bVar.f1999i = bVar.f1991a.getText(i11);
            this.f2034a.f2001k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f2034a.f1996f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f2034a;
            bVar.f2016z = view;
            bVar.f2015y = 0;
            bVar.E = false;
            return this;
        }

        public a(@NonNull Context context, int i11) {
            this.f2034a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, i11)));
            this.f2035b = i11;
        }
    }

    protected b(@NonNull Context context, int i11) {
        super(context, g(context, i11));
        this.f2033c = new AlertController(getContext(), this, getWindow());
    }

    static int g(@NonNull Context context, int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f73739p, typedValue, true);
        return typedValue.resourceId;
    }

    public Button e(int i11) {
        return this.f2033c.c(i11);
    }

    public ListView f() {
        return this.f2033c.e();
    }

    public void h(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f2033c.k(i11, charSequence, onClickListener, null, null);
    }

    public void i(CharSequence charSequence) {
        this.f2033c.o(charSequence);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2033c.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.f2033c.g(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f2033c.h(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2033c.q(charSequence);
    }
}
