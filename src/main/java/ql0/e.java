package ql0;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {

    public interface a {
        @NonNull
        a a(@NonNull i iVar);

        @NonNull
        e build();
    }

    public interface b {
    }

    @NonNull
    public static a a(@NonNull Context context) {
        return new f(context).a(rl0.a.r());
    }

    @NonNull
    public static e b(@NonNull Context context) {
        return a(context).a(rl0.a.r()).build();
    }

    public abstract void c(@NonNull TextView textView, @NonNull String str);

    public abstract void d(@NonNull TextView textView, @NonNull Spanned spanned);

    @NonNull
    public abstract Spanned e(@NonNull String str);
}
