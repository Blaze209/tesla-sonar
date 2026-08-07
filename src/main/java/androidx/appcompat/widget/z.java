package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private TextView f2905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f2906b;

    z(@NonNull TextView textView) {
        this.f2905a = (TextView) u5.h.g(textView);
    }

    @NonNull
    public TextClassifier a() {
        TextClassifier textClassifier = this.f2906b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerA = x.a(this.f2905a.getContext().getSystemService(w.a()));
        return textClassificationManagerA != null ? textClassificationManagerA.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f2906b = textClassifier;
    }
}
