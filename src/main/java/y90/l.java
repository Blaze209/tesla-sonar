package y90;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.core.GestureHandler;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ1\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly90/l;", "", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "handler", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;)V", "", "newState", "oldState", "a", "(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface l {
    <T extends GestureHandler> void a(T handler, int newState, int oldState);

    <T extends GestureHandler> void b(T handler);

    <T extends GestureHandler> void c(T handler, MotionEvent event);
}
