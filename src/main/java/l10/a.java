package l10;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003R \u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Ll10/a;", "", "<init>", "()V", "Landroid/widget/EditText;", "textInput", "Ljn0/h0;", "c", "(Landroid/widget/EditText;)V", "b", "()Landroid/widget/EditText;", "a", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "input", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f89487a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static WeakReference<EditText> input;

    private a() {
    }

    public final void a() {
        EditText editText;
        WeakReference<EditText> weakReference = input;
        if (weakReference == null || (editText = weakReference.get()) == null) {
            return;
        }
        c10.c.e(editText);
    }

    public final EditText b() {
        WeakReference<EditText> weakReference = input;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(EditText textInput) {
        s.k(textInput, "textInput");
        input = new WeakReference<>(textInput);
    }
}
