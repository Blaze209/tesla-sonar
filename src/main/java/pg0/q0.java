package pg0;

import android.widget.TextView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/widget/TextView;", "", "to", "Ljn0/h0;", "b", "(Landroid/widget/TextView;Ljava/lang/String;)V", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TextView textView, String str) {
        if (p013kotlin.text.t.y0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }
}
