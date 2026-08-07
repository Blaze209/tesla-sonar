package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
final class s {

    class a implements b6.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2806a;

        a(View view) {
            this.f2806a = view;
        }

        @Override // b6.d.c
        public boolean a(b6.e eVar, int i11, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i11 & 1) != 0) {
                try {
                    eVar.d();
                    InputContentInfo inputContentInfoA = r.a(eVar.e());
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfoA);
                } catch (Exception e11) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e11);
                    return false;
                }
            }
            return ViewCompat.f0(this.f2806a, new androidx.core.view.d.a(new ClipData(eVar.b(), new ClipData.Item(eVar.a())), 2).d(eVar.c()).b(bundle).a()) == null;
        }
    }

    private static final class b {
        static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.f0(textView, new androidx.core.view.d.a(dragEvent.getClipData(), 3).a());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.f0(view, new androidx.core.view.d.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    @NonNull
    static b6.d.c a(@NonNull View view) {
        return new a(view);
    }

    static boolean b(@NonNull View view, @NonNull DragEvent dragEvent) {
        if (dragEvent.getLocalState() == null && ViewCompat.D(view) != null) {
            Activity activityD = d(view);
            if (activityD == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? b.a(dragEvent, (TextView) view, activityD) : b.b(dragEvent, view, activityD);
            }
        }
        return false;
    }

    static boolean c(@NonNull TextView textView, int i11) {
        if ((i11 != 16908322 && i11 != 16908337) || ViewCompat.D(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ViewCompat.f0(textView, new androidx.core.view.d.a(primaryClip, 1).c(i11 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    static Activity d(@NonNull View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
