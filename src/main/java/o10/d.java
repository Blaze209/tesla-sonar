package o10;

import android.graphics.Point;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.v0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo10/d;", "Lcom/facebook/react/uimanager/m;", "<init>", "()V", "Lcom/facebook/react/uimanager/j0;", "child", "", IntegerTokenConverter.CONVERTER_KEY, "Ljn0/h0;", "addChildAt", "(Lcom/facebook/react/uimanager/j0;I)V", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends m {
    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void addChildAt(j0 child, int i11) {
        s.k(child, "child");
        super.addChildAt(child, i11);
        v0 themedContext = getThemedContext();
        s.j(themedContext, "getThemedContext(...)");
        Point pointB = c10.a.b(themedContext);
        child.setStyleWidth(pointB.x);
        child.setStyleHeight(pointB.y);
    }
}
