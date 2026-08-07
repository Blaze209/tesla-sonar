package qi0;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import mi0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqi0/a;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)Ljava/lang/String;", "", "b", "(Landroid/view/View;)Z", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105586a = new a();

    private a() {
    }

    public final String a(View view) {
        s.k(view, "view");
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(e.G);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(e.f92203w0);
        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(e.E0);
        TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(e.L);
        EditText editText = textInputLayout.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = textInputLayout2.getEditText();
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        EditText editText3 = textInputLayout3.getEditText();
        String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = textInputLayout4.getEditText();
        return v.y0(v.p(strValueOf, strValueOf2, strValueOf3, String.valueOf(editText4 != null ? editText4.getText() : null)), "", null, null, 0, null, null, 62, null);
    }

    public final boolean b(View view) {
        s.k(view, "view");
        return a(view).length() == 4;
    }
}
