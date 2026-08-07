package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5670a;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
            viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
        }

        static void e(ViewStructure viewStructure, int i11, String str, String str2, String str3) {
            viewStructure.setId(i11, str, str2, str3);
        }

        static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void g(ViewStructure viewStructure, float f11, int i11, int i12, int i13) {
            viewStructure.setTextStyle(f11, i11, i12, i13);
        }
    }

    private f(@NonNull ViewStructure viewStructure) {
        this.f5670a = viewStructure;
    }

    @NonNull
    public static f i(@NonNull ViewStructure viewStructure) {
        return new f(viewStructure);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.f5670a);
    }

    public void b(@NonNull String str) {
        a.b((ViewStructure) this.f5670a, str);
    }

    public void c(@NonNull CharSequence charSequence) {
        a.c((ViewStructure) this.f5670a, charSequence);
    }

    public void d(int i11, int i12, int i13, int i14, int i15, int i16) {
        a.d((ViewStructure) this.f5670a, i11, i12, i13, i14, i15, i16);
    }

    public void e(int i11, String str, String str2, String str3) {
        a.e((ViewStructure) this.f5670a, i11, str, str2, str3);
    }

    public void f(@NonNull CharSequence charSequence) {
        a.f((ViewStructure) this.f5670a, charSequence);
    }

    public void g(float f11, int i11, int i12, int i13) {
        a.g((ViewStructure) this.f5670a, f11, i11, i12, i13);
    }

    @NonNull
    public ViewStructure h() {
        return (ViewStructure) this.f5670a;
    }
}
