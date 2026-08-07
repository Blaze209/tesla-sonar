package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k3.z3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.y3;
import v3.PointerInputEventData;
import x3.RotaryScrollEvent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002®\u0004\b\u0000\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00029:B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0#H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*J'\u00100\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u001c2\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u000e*\u000202H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u0010\u001eJ%\u0010<\u001a\u00020;2\u0006\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001cH\u0002¢\u0006\u0004\bA\u0010\u001eJ\u0017\u0010C\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bC\u00105J\u0017\u0010D\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bD\u00105J\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u001d\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020EH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020E2\u0006\u0010M\u001a\u00020EH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bP\u0010HJ\u001d\u0010Q\u001a\u00020J2\u0006\u0010I\u001a\u00020EH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010LJ1\u0010V\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020E2\u0006\u0010R\u001a\u00020\u00142\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010U\u001a\u00020\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bX\u0010HJ\u000f\u0010Y\u001a\u00020\u001cH\u0002¢\u0006\u0004\bY\u0010\u001eJ\u0017\u0010Z\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\\\u0010\u001eJ\u000f\u0010]\u001a\u00020\u000eH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\b_\u0010HJ\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\b`\u0010HJ!\u0010c\u001a\u0004\u0018\u00010\u00162\u0006\u0010a\u001a\u00020\u00142\u0006\u0010b\u001a\u00020\u0016H\u0002¢\u0006\u0004\bc\u0010dJ4\u0010k\u001a\u00020h2\"\u0010j\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020f\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0g\u0012\u0006\u0012\u0004\u0018\u00010i0eH\u0096@¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020\u001c2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ-\u0010{\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020m2\u0006\u0010w\u001a\u00020v2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020y0xH\u0016¢\u0006\u0004\b{\u0010|J\u0018\u0010\u007f\u001a\u00020\u001c2\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J'\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J$\u0010\u0084\u0001\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J-\u0010\u0087\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010mH\u0014¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u001c2\u0007\u0010\u0089\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001b\u0010\u008d\u0001\u001a\u00020\u000e2\u0007\u0010F\u001a\u00030\u008c\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u000e2\u0007\u0010F\u001a\u00030\u008c\u0001H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001J\u001b\u0010\u0091\u0001\u001a\u00020\u001c2\u0007\u0010\u0090\u0001\u001a\u00020SH\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0093\u0001\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0016¢\u0006\u0005\b\u0093\u0001\u00105J\u0019\u0010\u0094\u0001\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0016¢\u0006\u0005\b\u0094\u0001\u00105J\u000f\u0010\u0095\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0095\u0001\u0010\u001eJ\u0011\u0010\u0096\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u0096\u0001\u0010\u001eJ\"\u0010\u0099\u0001\u001a\u00020\u001c2\u000e\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001d\u0010\u009c\u0001\u001a\u00020\u001c2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J&\u0010\u009c\u0001\u001a\u00020\u001c2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u009e\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009f\u0001J/\u0010\u009c\u0001\u001a\u00020\u001c2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010 \u0001\u001a\u00020\u00142\u0007\u0010¡\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u009c\u0001\u0010¢\u0001J)\u0010\u009c\u0001\u001a\u00020\u001c2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00162\n\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010¥\u0001J2\u0010\u009c\u0001\u001a\u00020\u001c2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u009e\u0001\u001a\u00020\u00142\n\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010¦\u0001J#\u0010ª\u0001\u001a\u00020\u001c2\b\u0010¨\u0001\u001a\u00030§\u00012\u0007\u0010©\u0001\u001a\u000202¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001a\u0010¬\u0001\u001a\u00020\u001c2\b\u0010¨\u0001\u001a\u00030§\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J$\u0010°\u0001\u001a\u00020\u001c2\b\u0010¨\u0001\u001a\u00030§\u00012\b\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0019\u00109\u001a\u00020\u001c2\u0007\u0010²\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b9\u0010\u008b\u0001J(\u0010µ\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\b\u0010´\u0001\u001a\u00030³\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bµ\u0001\u0010¶\u0001J$\u0010¸\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\u0007\u0010·\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J6\u0010¼\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\u0007\u0010·\u0001\u001a\u00020\u000e2\u0007\u0010º\u0001\u001a\u00020\u000e2\u0007\u0010»\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¼\u0001\u0010½\u0001J+\u0010:\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\u0007\u0010·\u0001\u001a\u00020\u000e2\u0007\u0010º\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b:\u0010¾\u0001J\u001a\u0010¿\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u000202H\u0016¢\u0006\u0005\b¿\u0001\u00105J$\u0010Â\u0001\u001a\u00020\u001c2\u0007\u0010À\u0001\u001a\u00020\u00142\u0007\u0010Á\u0001\u001a\u00020\u0014H\u0014¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J>\u0010Ç\u0001\u001a\u00020\u001c2\u0007\u0010Ä\u0001\u001a\u00020\u000e2\u0007\u0010\u0096\u0001\u001a\u00020\u00142\u0007\u0010Å\u0001\u001a\u00020\u00142\u0007\u0010Æ\u0001\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u0014H\u0014¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u001c\u0010É\u0001\u001a\u00020\u001c2\b\u0010¯\u0001\u001a\u00030®\u0001H\u0014¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JN\u0010Ñ\u0001\u001a\u00030Ð\u00012\u001d\u0010Í\u0001\u001a\u0018\u0012\u0005\u0012\u00030Ë\u0001\u0012\u0007\u0012\u0005\u0018\u00010Ì\u0001\u0012\u0004\u0012\u00020\u001c0e2\u000e\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u0097\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Ì\u0001H\u0016¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u001c\u0010Ô\u0001\u001a\u00020\u000e2\b\u0010Ó\u0001\u001a\u00030Ð\u0001H\u0000¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0011\u0010Ö\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\bÖ\u0001\u0010\u001eJ\u001a\u0010Æ\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u000202H\u0016¢\u0006\u0005\bÆ\u0001\u00105J \u0010Ø\u0001\u001a\u00020\u001c2\f\u0010¨\u0001\u001a\u00070\u0016j\u0003`×\u0001H\u0016¢\u0006\u0006\bØ\u0001\u0010\u009d\u0001J\u001c\u0010Å\u0001\u001a\u00020\u001c2\b\u0010\u0098\u0001\u001a\u00030Ù\u0001H\u0016¢\u0006\u0006\bÅ\u0001\u0010Ú\u0001J!\u0010Ý\u0001\u001a\u0004\u0018\u00010\f2\b\u0010Ü\u0001\u001a\u00030Û\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u001c\u0010ß\u0001\u001a\u00020\u001c2\b\u0010¯\u0001\u001a\u00030®\u0001H\u0014¢\u0006\u0006\bß\u0001\u0010Ê\u0001J%\u0010á\u0001\u001a\u00020\u001c2\b\u0010Ó\u0001\u001a\u00030Ð\u00012\u0007\u0010à\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0006\bá\u0001\u0010â\u0001J&\u0010å\u0001\u001a\u00020\u001c2\u0014\u0010ä\u0001\u001a\u000f\u0012\u0005\u0012\u00030ã\u0001\u0012\u0004\u0012\u00020\u001c0#¢\u0006\u0006\bå\u0001\u0010æ\u0001J\u0013\u0010ç\u0001\u001a\u00020\u001cH\u0086@¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0013\u0010é\u0001\u001a\u00020\u001cH\u0086@¢\u0006\u0006\bé\u0001\u0010è\u0001J\u0011\u0010ê\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\bê\u0001\u0010\u001eJ\u0011\u0010ë\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bë\u0001\u0010\u001eJ\u0011\u0010ì\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bì\u0001\u0010\u001eJ%\u0010î\u0001\u001a\u00020\u001c2\b\u0010r\u001a\u0004\u0018\u00010q2\u0007\u0010í\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\bî\u0001\u0010ï\u0001J#\u0010ó\u0001\u001a\u00020\u001c2\u000f\u0010ò\u0001\u001a\n\u0012\u0005\u0012\u00030ñ\u00010ð\u0001H\u0016¢\u0006\u0006\bó\u0001\u0010ô\u0001J8\u0010û\u0001\u001a\u00020\u001c2\b\u0010ö\u0001\u001a\u00030õ\u00012\b\u0010ø\u0001\u001a\u00030÷\u00012\u0010\u0010ú\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ù\u00010xH\u0017¢\u0006\u0006\bû\u0001\u0010ü\u0001J%\u0010\u0080\u0002\u001a\u00020\u001c2\u0011\u0010ÿ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010þ\u00010ý\u0001H\u0017¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0019\u0010\u0082\u0002\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0016¢\u0006\u0005\b\u0082\u0002\u0010HJ\u0019\u0010\u0083\u0002\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0016¢\u0006\u0005\b\u0083\u0002\u0010HJ\u0019\u0010\u0084\u0002\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0084\u0002\u0010\u0010J\u0019\u0010\u0085\u0002\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0085\u0002\u0010\u0010J \u0010\u0088\u0002\u001a\u00030\u0086\u00022\b\u0010\u0087\u0002\u001a\u00030\u0086\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J\u001f\u0010\u008c\u0002\u001a\u00020\u001c2\b\u0010\u008b\u0002\u001a\u00030\u008a\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002J \u0010\u008f\u0002\u001a\u00030\u0086\u00022\b\u0010\u008e\u0002\u001a\u00030\u0086\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008f\u0002\u0010\u0089\u0002J\u0011\u0010\u0090\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0090\u0002\u0010^J\u001f\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u0093\u00022\b\u0010\u0092\u0002\u001a\u00030\u0091\u0002H\u0016¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J \u0010\u0097\u0002\u001a\u00030\u0086\u00022\b\u0010\u0096\u0002\u001a\u00030\u0086\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0097\u0002\u0010\u0089\u0002J \u0010\u0098\u0002\u001a\u00030\u0086\u00022\b\u0010\u0087\u0002\u001a\u00030\u0086\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0098\u0002\u0010\u0089\u0002J\u001c\u0010\u009b\u0002\u001a\u00020\u001c2\b\u0010\u009a\u0002\u001a\u00030\u0099\u0002H\u0014¢\u0006\u0006\b\u009b\u0002\u0010\u009c\u0002J\u001b\u0010\u009e\u0002\u001a\u00020\u001c2\u0007\u0010\u009d\u0002\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J\u0019\u0010 \u0002\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0005\b \u0002\u0010HJ\u0019\u0010¡\u0002\u001a\u0004\u0018\u00010\u00162\u0006\u0010a\u001a\u00020\u0014¢\u0006\u0005\b¡\u0002\u0010\u0018J\u0011\u0010¢\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¢\u0002\u0010^R\u001f\u0010¤\u0002\u001a\u00030\u0086\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b9\u0010£\u0002R\u0017\u0010¥\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010]R \u0010«\u0002\u001a\u00030¦\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002R5\u0010³\u0002\u001a\u00030¬\u00022\b\u0010\u00ad\u0002\u001a\u00030¬\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b¿\u0001\u0010®\u0002\u001a\u0006\b¯\u0002\u0010°\u0002\"\u0006\b±\u0002\u0010²\u0002R\u0018\u0010¶\u0002\u001a\u00030´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010µ\u0002R\u0018\u0010¹\u0002\u001a\u00030·\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010¸\u0002R\u001f\u0010¾\u0002\u001a\u00030º\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bk\u0010»\u0002\u001a\u0006\b¼\u0002\u0010½\u0002R\u0018\u0010Á\u0002\u001a\u00030¿\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010À\u0002R1\u0010\t\u001a\u00020\b2\u0007\u0010Â\u0002\u001a\u00020\b8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÃ\u0002\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010Æ\u0002\"\u0006\bÇ\u0002\u0010È\u0002R \u0010Í\u0002\u001a\u00030É\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010Ê\u0002\u001a\u0006\bË\u0002\u0010Ì\u0002R\u0018\u0010Ð\u0002\u001a\u00030Î\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010Ï\u0002R\u0018\u0010Ó\u0002\u001a\u00030Ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010Ò\u0002R\u0018\u0010Ô\u0002\u001a\u00030Ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0002\u0010Ò\u0002R\u0018\u0010×\u0002\u001a\u00030Õ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0002\u0010Ö\u0002R\u001f\u0010Û\u0002\u001a\u0002028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008c\u0002\u0010Ø\u0002\u001a\u0006\bÙ\u0002\u0010Ú\u0002R \u0010á\u0002\u001a\u00030Ü\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÝ\u0002\u0010Þ\u0002\u001a\u0006\bß\u0002\u0010à\u0002R \u0010æ\u0002\u001a\u00030â\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010ã\u0002\u001a\u0006\bä\u0002\u0010å\u0002R\u0018\u0010é\u0002\u001a\u00030ç\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010è\u0002R*\u0010ð\u0002\u001a\u00030ê\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010ë\u0002\u001a\u0006\bì\u0002\u0010í\u0002\"\u0006\bî\u0002\u0010ï\u0002R \u0010õ\u0002\u001a\u00030ñ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010ò\u0002\u001a\u0006\bó\u0002\u0010ô\u0002R \u0010û\u0002\u001a\u00030ö\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b÷\u0002\u0010ø\u0002\u001a\u0006\bù\u0002\u0010ú\u0002R \u0010\u0080\u0003\u001a\u00030ü\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010ý\u0002\u001a\u0006\bþ\u0002\u0010ÿ\u0002R\u001f\u0010\u0083\u0003\u001a\n\u0012\u0005\u0012\u00030Ð\u00010\u0081\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0082\u0003R#\u0010\u0084\u0003\u001a\f\u0012\u0005\u0012\u00030Ð\u0001\u0018\u00010\u0081\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u0082\u0003R\u0018\u0010\u0085\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010]R\u0018\u0010\u0087\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0003\u0010]R\u0018\u0010\u008b\u0003\u001a\u00030\u0088\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0003\u0010\u008a\u0003R\u0018\u0010\u008f\u0003\u001a\u00030\u008c\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0003\u0010\u008e\u0003R6\u0010\u0095\u0003\u001a\u000f\u0012\u0005\u0012\u00030\u0099\u0002\u0012\u0004\u0012\u00020\u001c0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0003\u0010\u0091\u0003\u001a\u0006\b\u0092\u0003\u0010\u0093\u0003\"\u0006\b\u0094\u0003\u0010æ\u0001R\u001a\u0010\u0099\u0003\u001a\u0005\u0018\u00010\u0096\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0003\u0010\u0098\u0003R\u0018\u0010\u009b\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0003\u0010]R \u0010¡\u0003\u001a\u00030\u009c\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009d\u0003\u0010\u009e\u0003\u001a\u0006\b\u009f\u0003\u0010 \u0003R \u0010§\u0003\u001a\u00030¢\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0003\u0010¤\u0003\u001a\u0006\b¥\u0003\u0010¦\u0003R.\u0010¬\u0003\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u001d\n\u0005\b¨\u0003\u0010]\u0012\u0005\b«\u0003\u0010\u001e\u001a\u0005\b©\u0003\u0010^\"\u0006\bª\u0003\u0010\u008b\u0001R\u001c\u0010°\u0003\u001a\u0005\u0018\u00010\u00ad\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0003\u0010¯\u0003R\u001c\u0010³\u0003\u001a\u0005\u0018\u00010±\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010²\u0003R\"\u0010¶\u0003\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b´\u0003\u0010µ\u0003R\u0018\u0010¸\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0003\u0010]R\u0018\u0010¼\u0003\u001a\u00030¹\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0003\u0010»\u0003R \u0010Â\u0003\u001a\u00030½\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¾\u0003\u0010¿\u0003\u001a\u0006\bÀ\u0003\u0010Á\u0003R \u0010Å\u0003\u001a\u00030Ã\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÄ\u0003\u0010£\u0002R\u0018\u0010È\u0003\u001a\u00030÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0003\u0010Ç\u0003R\u001e\u0010Ë\u0003\u001a\u00030\u008a\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÉ\u0003\u0010Ê\u0003R\u001e\u0010Í\u0003\u001a\u00030\u008a\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÌ\u0003\u0010Ê\u0003R\u001e\u0010Ï\u0003\u001a\u00030\u008a\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÎ\u0003\u0010Ê\u0003R0\u0010Õ\u0003\u001a\u00020S8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÐ\u0003\u0010£\u0002\u0012\u0005\bÔ\u0003\u0010\u001e\u001a\u0006\bÑ\u0003\u0010Ò\u0003\"\u0006\bÓ\u0003\u0010\u0092\u0001R\u0018\u0010×\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÖ\u0003\u0010]R \u0010Ù\u0003\u001a\u00030\u0086\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bØ\u0003\u0010£\u0002R\u0018\u0010Û\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÚ\u0003\u0010]R9\u0010à\u0003\u001a\u0005\u0018\u00010ã\u00012\n\u0010\u00ad\u0002\u001a\u0005\u0018\u00010ã\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bé\u0001\u0010®\u0002\u001a\u0006\bÜ\u0003\u0010Ý\u0003\"\u0006\bÞ\u0003\u0010ß\u0003R#\u0010ã\u0003\u001a\u0005\u0018\u00010ã\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bç\u0001\u0010á\u0003\u001a\u0006\bâ\u0003\u0010Ý\u0003R'\u0010ä\u0003\u001a\u0011\u0012\u0005\u0012\u00030ã\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0091\u0003R\u0017\u0010ç\u0003\u001a\u00030å\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010æ\u0003R\u0017\u0010ê\u0003\u001a\u00030è\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010é\u0003R\u0017\u0010í\u0003\u001a\u00030ë\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010ì\u0003R\u0018\u0010ð\u0003\u001a\u00030î\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010ï\u0003R\u001f\u0010õ\u0003\u001a\u00030ñ\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0017\u0010ò\u0003\u001a\u0006\bó\u0003\u0010ô\u0003R$\u0010ù\u0003\u001a\n\u0012\u0005\u0012\u00030÷\u00030ö\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bc\u0010ø\u0003R \u0010þ\u0003\u001a\u00030ú\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÝ\u0001\u0010û\u0003\u001a\u0006\bü\u0003\u0010ý\u0003R'\u0010\u0085\u0004\u001a\u00030ÿ\u00038\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u0080\u0004\u0010\u0081\u0004\u0012\u0005\b\u0084\u0004\u0010\u001e\u001a\u0006\b\u0082\u0004\u0010\u0083\u0004R5\u0010\u008c\u0004\u001a\u00030\u0086\u00042\b\u0010\u00ad\u0002\u001a\u00030\u0086\u00048V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u0087\u0004\u0010®\u0002\u001a\u0006\b\u0088\u0004\u0010\u0089\u0004\"\u0006\b\u008a\u0004\u0010\u008b\u0004R\u0018\u0010\u008d\u0004\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bK\u0010®\u0003R4\u0010\u009d\u0002\u001a\u00030\u008e\u00042\b\u0010\u00ad\u0002\u001a\u00030\u008e\u00048V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bG\u0010®\u0002\u001a\u0006\b\u008f\u0004\u0010\u0090\u0004\"\u0006\b\u0091\u0004\u0010\u0092\u0004R\u001f\u0010\u0097\u0004\u001a\u00030\u0093\u00048\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bN\u0010\u0094\u0004\u001a\u0006\b\u0095\u0004\u0010\u0096\u0004R\u0018\u0010\u009a\u0004\u001a\u00030\u0098\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010\u0099\u0004R\u001f\u0010\u009f\u0004\u001a\u00030\u009b\u00048\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bD\u0010\u009c\u0004\u001a\u0006\b\u009d\u0004\u0010\u009e\u0004R\u001f\u0010¤\u0004\u001a\u00030 \u00048\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bC\u0010¡\u0004\u001a\u0006\b¢\u0004\u0010£\u0004R\u001a\u0010¦\u0004\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010¥\u0004R\u0018\u0010§\u0004\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010£\u0002R\u001e\u0010ª\u0004\u001a\n\u0012\u0005\u0012\u00030Ð\u00010¨\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bX\u0010©\u0004R&\u0010\u00ad\u0004\u001a\u0012\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0097\u00010«\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010¬\u0004R\u0018\u0010°\u0004\u001a\u00030®\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010¯\u0004R\u0017\u0010³\u0004\u001a\u00030±\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010²\u0004R\u0017\u0010´\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010]R\u001d\u0010¶\u0004\u001a\t\u0012\u0004\u0012\u00020\u001c0\u0097\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010µ\u0004R\u0017\u0010¹\u0004\u001a\u00030·\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010¸\u0004R\u0017\u0010º\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010]R\u0019\u0010½\u0004\u001a\u0005\u0018\u00010»\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010¼\u0004R\u001f\u0010Â\u0004\u001a\u00030¾\u00048\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bZ\u0010¿\u0004\u001a\u0006\bÀ\u0004\u0010Á\u0004R\u001c\u0010Ä\u0004\u001a\u00020\u0014*\u00030\u0099\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0004\u0010Ã\u0004R\u0017\u0010¨\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0004\u0010Æ\u0004R\u0018\u0010Ê\u0004\u001a\u00030Ç\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0004\u0010É\u0004R\u001a\u0010ó\u0001\u001a\u0005\u0018\u00010Ë\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÌ\u0004\u0010Í\u0004R\u0018\u0010Ð\u0004\u001a\u00030\u00ad\u00038@X\u0080\u0004¢\u0006\b\u001a\u0006\bÎ\u0004\u0010Ï\u0004R\u0017\u0010Ò\u0004\u001a\u00020S8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0004\u0010Ò\u0003R\u0016\u0010Ô\u0004\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0004\u0010^R\u0018\u0010Ø\u0004\u001a\u00030Õ\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0004\u0010×\u0004R\u0018\u0010Ü\u0004\u001a\u00030Ù\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0004\u0010Û\u0004R\u0016\u0010Þ\u0004\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0004\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ß\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lb4/j1;", "Landroidx/compose/ui/platform/k3;", "Lv3/l0;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/focus/d;", "focusDirection", "", "z0", "(I)Z", "Lj3/i;", "y0", "()Lj3/i;", "", "direction", "Landroid/view/View;", "h0", "(I)Landroid/view/View;", "previouslyFocusedRect", "A0", "(Landroidx/compose/ui/focus/d;Lj3/i;)Z", "Ljn0/h0;", "x0", "()V", "Lg3/h;", "transferData", "Lj3/m;", "decorationSize", "Lkotlin/Function1;", "Lm3/f;", "drawDragDecoration", "P0", "(Lg3/h;JLwn0/l;)Z", "viewGroup", "d0", "(Landroid/view/ViewGroup;)V", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "extraDataKey", "Y", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V", "Lb4/g0;", "nodeToRemeasure", "I0", "(Lb4/g0;)V", "c0", "(Lb4/g0;)Z", "f0", "a", "b", "Ljn0/c0;", "B0", "(II)J", "measureSpec", "e0", "(I)J", "R0", "node", "r0", "q0", "Landroid/view/MotionEvent;", "event", "n0", "(Landroid/view/MotionEvent;)Z", "motionEvent", "Lv3/m0;", "m0", "(Landroid/view/MotionEvent;)I", "lastEvent", "o0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "t0", "M0", "action", "", "eventTime", "forceHover", "N0", "(Landroid/view/MotionEvent;IJZ)V", "u0", "C0", "D0", "(Landroid/view/MotionEvent;)V", "E0", "Z", "()Z", "s0", "v0", "accessibilityId", "currentView", "i0", "(ILandroid/view/View;)Landroid/view/View;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/f2;", "Lkotlin/coroutines/Continuation;", "", "", "session", "g", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "localVisibleRect", "Landroid/graphics/Point;", "windowOffset", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "onScrollCaptureSearch", "(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onResume", "(Landroidx/lifecycle/LifecycleOwner;)V", "focused", "focusSearch", "(Landroid/view/View;I)Landroid/view/View;", "requestFocus", "(ILandroid/graphics/Rect;)Z", "gainFocus", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEventPreIme", "intervalMillis", "setAccessibilityEventBatchIntervalMillis", "(J)V", "s", "h", "H0", "l", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "(Lwn0/a;)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", Snapshot.WIDTH, Snapshot.HEIGHT, "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroidx/compose/ui/viewinterop/d;", "view", "layoutNode", "X", "(Landroidx/compose/ui/viewinterop/d;Lb4/g0;)V", "G0", "(Landroidx/compose/ui/viewinterop/d;)V", "Landroid/graphics/Canvas;", "canvas", "g0", "(Landroidx/compose/ui/viewinterop/d;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "y", "(Lb4/g0;J)V", "affectsLookahead", "k", "(Lb4/g0;Z)V", "forceRequest", "scheduleMeasureAndLayout", "q", "(Lb4/g0;ZZZ)V", "(Lb4/g0;ZZ)V", DateTokenConverter.CONVERTER_KEY, "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "t", "r", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Lk3/j1;", "Ln3/c;", "drawBlock", "invalidateParentLayer", "explicitLayer", "Lb4/i1;", "f", "(Lwn0/p;Lwn0/a;Ln3/c;)Lb4/i1;", "layer", "F0", "(Lb4/i1;)Z", "x", "Landroidx/compose/ui/viewinterop/InteropView;", "e", "Lb4/j1$b;", "(Lb4/j1$b;)V", "Lt3/b;", "keyEvent", "j0", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/d;", "dispatchDraw", "isDirty", "w0", "(Lb4/i1;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "(Lwn0/l;)V", "b0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a0", "p0", "onAttachedToWindow", "onDetachedFromWindow", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "", "virtualIds", "", "supportedFormats", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses", "(Landroid/util/LongSparseArray;)V", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Lj3/g;", "localPosition", "w", "(J)J", "Lk3/n3;", "localTransform", "o", "([F)V", "positionOnScreen", "n", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "positionInWindow", "j", "m", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "J", "lastDownPointerPosition", "superclassInitComplete", "Lb4/i0;", "c", "Lb4/i0;", "getSharedDrawScope", "()Lb4/i0;", "sharedDrawScope", "Lw4/d;", "<set-?>", "Lr2/p1;", "getDensity", "()Lw4/d;", "setDensity", "(Lw4/d;)V", "density", "Lg4/f;", "Lg4/f;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Li3/i;", "Li3/i;", "getFocusOwner", "()Li3/i;", "focusOwner", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "dragAndDropModifierOnDragListener", "value", IntegerTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "Lg3/c;", "Lg3/c;", "getDragAndDropManager", "()Lg3/c;", "dragAndDropManager", "Landroidx/compose/ui/platform/n3;", "Landroidx/compose/ui/platform/n3;", "_windowInfo", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "keyInputModifier", "rotaryInputModifier", "Lk3/k1;", "Lk3/k1;", "canvasHolder", "Lb4/g0;", "getRoot", "()Lb4/g0;", "root", "Lb4/r1;", "p", "Lb4/r1;", "getRootForTest", "()Lb4/r1;", "rootForTest", "Lg4/r;", "Lg4/r;", "getSemanticsOwner", "()Lg4/r;", "semanticsOwner", "Landroidx/compose/ui/platform/w;", "Landroidx/compose/ui/platform/w;", "composeAccessibilityDelegate", "Lf3/b;", "Lf3/b;", "getContentCaptureManager$ui_release", "()Lf3/b;", "setContentCaptureManager$ui_release", "(Lf3/b;)V", "contentCaptureManager", "Landroidx/compose/ui/platform/j;", "Landroidx/compose/ui/platform/j;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/j;", "accessibilityManager", "Lk3/g3;", "u", "Lk3/g3;", "getGraphicsContext", "()Lk3/g3;", "graphicsContext", "Le3/l;", "Le3/l;", "getAutofillTree", "()Le3/l;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "postponedDirtyLayers", "isDrawingContent", "z", "isPendingInteropViewLayoutChangeDispatch", "Lv3/h;", "A", "Lv3/h;", "motionEventAdapter", "Lv3/b0;", "B", "Lv3/b0;", "pointerInputEventProcessor", "C", "Lwn0/l;", "getConfigurationChangeObserver", "()Lwn0/l;", "setConfigurationChangeObserver", "configurationChangeObserver", "Le3/c;", "D", "Le3/c;", "_autofill", "E", "observationClearRequested", "Landroidx/compose/ui/platform/k;", Gender.FEMALE, "Landroidx/compose/ui/platform/k;", "getClipboardManager", "()Landroidx/compose/ui/platform/k;", "clipboardManager", "Lb4/l1;", "G", "Lb4/l1;", "getSnapshotObserver", "()Lb4/l1;", "snapshotObserver", "H", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "Landroidx/compose/ui/platform/r0;", "I", "Landroidx/compose/ui/platform/r0;", "_androidViewsHandler", "Landroidx/compose/ui/platform/g1;", "Landroidx/compose/ui/platform/g1;", "viewLayersContainer", "K", "Lw4/b;", "onMeasureConstraints", "L", "wasMeasuredWithMultipleConstraints", "Lb4/r0;", Gender.MALE, "Lb4/r0;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/e3;", Gender.NONE, "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "viewConfiguration", "Lw4/n;", Gender.OTHER, "globalPosition", "P", "[I", "tmpPositionArray", "Q", "[F", "tmpMatrix", "R", "viewToWindowMatrix", "S", "windowToViewMatrix", "T", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", Gender.UNKNOWN, "forceUseMatrixCache", "V", "windowPosition", "W", "isRenderNodeCompatible", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "_viewTreeOwners", "Lr2/y3;", "getViewTreeOwners", "viewTreeOwners", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Lo4/s0;", "Lo4/s0;", "legacyTextInputServiceAndroid", "Lo4/q0;", "Lo4/q0;", "getTextInputService", "()Lo4/q0;", "textInputService", "Ld3/k;", "Landroidx/compose/ui/platform/j0;", "Ljava/util/concurrent/atomic/AtomicReference;", "textInputSessionMutex", "Landroidx/compose/ui/platform/r2;", "Landroidx/compose/ui/platform/r2;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/r2;", "softwareKeyboardController", "Ln4/p$b;", "k0", "Ln4/p$b;", "getFontLoader", "()Ln4/p$b;", "getFontLoader$annotations", "fontLoader", "Ln4/q$b;", "l0", "getFontFamilyResolver", "()Ln4/q$b;", "setFontFamilyResolver", "(Ln4/q$b;)V", "fontFamilyResolver", "currentFontWeightAdjustment", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "setLayoutDirection", "(Lw4/t;)V", "Lr3/a;", "Lr3/a;", "getHapticFeedBack", "()Lr3/a;", "hapticFeedBack", "Ls3/c;", "Ls3/c;", "_inputModeManager", "La4/f;", "La4/f;", "getModifierLocalManager", "()La4/f;", "modifierLocalManager", "Landroidx/compose/ui/platform/u2;", "Landroidx/compose/ui/platform/u2;", "getTextToolbar", "()Landroidx/compose/ui/platform/u2;", "textToolbar", "Landroid/view/MotionEvent;", "previousMotionEvent", "relayoutTime", "Landroidx/compose/ui/platform/l3;", "Landroidx/compose/ui/platform/l3;", "layerCache", "Lt2/b;", "Lt2/b;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$u", "Landroidx/compose/ui/platform/AndroidComposeView$u;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "sendHoverExitEvent", "hoverExitReceived", "Lwn0/a;", "resendMotionEventOnLayout", "Landroidx/compose/ui/platform/t0;", "Landroidx/compose/ui/platform/t0;", "matrixToWindow", "keyboardModifiersRequireUpdate", "Lf4/h;", "Lf4/h;", "scrollCapture", "Lv3/u;", "Lv3/u;", "getPointerIconService", "()Lv3/u;", "pointerIconService", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/m3;", "getWindowInfo", "()Landroidx/compose/ui/platform/m3;", "windowInfo", "Le3/g;", "getAutofill", "()Le3/g;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/r0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lz3/w0$a;", "getPlacementScope", "()Lz3/w0$a;", "placementScope", "Ls3/b;", "getInputModeManager", "()Ls3/b;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements b4.j1, k3, v3.l0, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int F0 = 8;
    private static Class<?> G0;
    private static Method H0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final v3.h motionEventAdapter;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private final t0 matrixToWindow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final v3.b0 pointerInputEventProcessor;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private boolean keyboardModifiersRequireUpdate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private wn0.l<? super Configuration, jn0.h0> configurationChangeObserver;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private final f4.h scrollCapture;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final e3.c _autofill;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private final v3.u pointerIconService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean observationClearRequested;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.k clipboardManager;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final b4.l1 snapshotObserver;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private r0 _androidViewsHandler;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private g1 viewLayersContainer;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private w4.b onMeasureConstraints;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean wasMeasuredWithMultipleConstraints;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final b4.r0 measureAndLayoutDelegate;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final e3 viewConfiguration;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private long globalPosition;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final int[] tmpPositionArray;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final float[] tmpMatrix;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final float[] windowToViewMatrix;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private boolean forceUseMatrixCache;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private long windowPosition;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private boolean isRenderNodeCompatible;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long lastDownPointerPosition;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 _viewTreeOwners;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean superclassInitComplete;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final y3 viewTreeOwners;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b4.i0 sharedDrawScope;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super b, jn0.h0> onViewTreeOwnersAvailable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 density;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g4.f rootSemanticsNode;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final EmptySemanticsElement semanticsModifier;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i3.i focusOwner;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private final o4.s0 legacyTextInputServiceAndroid;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final o4.q0 textInputService;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference textInputSessionMutex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g3.c dragAndDropManager;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private final r2 softwareKeyboardController;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final n3 _windowInfo;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private final n4.p.b fontLoader;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d keyInputModifier;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 fontFamilyResolver;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d rotaryInputModifier;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private int currentFontWeightAdjustment;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k3.k1 canvasHolder;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 layoutDirection;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final b4.g0 root;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private final r3.a hapticFeedBack;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final b4.r1 rootForTest;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private final s3.c _inputModeManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final g4.r semanticsOwner;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private final a4.f modifierLocalManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.platform.w composeAccessibilityDelegate;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private final u2 textToolbar;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private f3.b contentCaptureManager;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private MotionEvent previousMotionEvent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.platform.j accessibilityManager;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private long relayoutTime;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final k3.g3 graphicsContext;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final l3<b4.i1> layerCache;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final e3.l autofillTree;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final t2.b<wn0.a<jn0.h0>> endApplyChangesListeners;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final List<b4.i1> dirtyLayers;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final u resendMotionEventRunnable;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private List<b4.i1> postponedDirtyLayers;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private final Runnable sendHoverExitEvent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawingContent;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private boolean hoverExitReceived;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean isPendingInteropViewLayoutChangeDispatch;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> resendMotionEventOnLayout;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "", "<init>", "()V", "", "b", "()Z", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (AndroidComposeView.G0 == null) {
                    AndroidComposeView.G0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.G0;
                    AndroidComposeView.H0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.H0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lxa/d;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Lxa/d;)V", "a", "Landroidx/lifecycle/LifecycleOwner;", "()Landroidx/lifecycle/LifecycleOwner;", "b", "Lxa/d;", "()Lxa/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final LifecycleOwner lifecycleOwner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final xa.d savedStateRegistryOwner;

        public b(LifecycleOwner lifecycleOwner, xa.d dVar) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = dVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final xa.d getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls3/a;", "it", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<s3.a, Boolean> {
        c() {
            super(1);
        }

        public final Boolean a(int i11) {
            boolean zRequestFocusFromTouch;
            s3.a.Companion companion = s3.a.INSTANCE;
            if (s3.a.f(i11, companion.b())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else if (s3.a.f(i11, companion.a())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true;
            } else {
                zRequestFocusFromTouch = false;
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(s3.a aVar) {
            return a(aVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$d", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Ljn0/h0;", "g", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b4.g0 f5565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f5566f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "it", "", "a", "(Lb4/g0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<b4.g0, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f5567c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(b4.g0 g0Var) {
                return Boolean.valueOf(g0Var.getNodes().r(b4.b1.a(8)));
            }
        }

        d(b4.g0 g0Var, AndroidComposeView androidComposeView) {
            this.f5565e = g0Var;
            this.f5566f = androidComposeView;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e  */
        @Override // androidx.core.view.a
        public void g(View host, AccessibilityNodeInfoCompat info) {
            super.g(host, info);
            if (AndroidComposeView.this.composeAccessibilityDelegate.p0()) {
                info.l1(false);
            }
            b4.g0 g0VarF = g4.q.f(this.f5565e, a.f5567c);
            Integer numValueOf = g0VarF != null ? Integer.valueOf(g0VarF.getSemanticsId()) : null;
            if (numValueOf != null) {
                if (numValueOf.intValue() == AndroidComposeView.this.getSemanticsOwner().a().getId()) {
                    numValueOf = -1;
                }
            } else {
                numValueOf = -1;
            }
            info.S0(this.f5566f, numValueOf.intValue());
            int semanticsId = this.f5565e.getSemanticsId();
            int iE = AndroidComposeView.this.composeAccessibilityDelegate.getIdToBeforeMap().e(semanticsId, -1);
            if (iE != -1) {
                View viewH = p2.h(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iE);
                if (viewH != null) {
                    info.i1(viewH);
                } else {
                    info.j1(this.f5566f, iE);
                }
                AndroidComposeView.this.Y(semanticsId, info.m1(), AndroidComposeView.this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal());
            }
            int iE2 = AndroidComposeView.this.composeAccessibilityDelegate.getIdToAfterMap().e(semanticsId, -1);
            if (iE2 != -1) {
                View viewH2 = p2.h(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iE2);
                if (viewH2 != null) {
                    info.g1(viewH2);
                } else {
                    info.h1(this.f5566f, iE2);
                }
                AndroidComposeView.this.Y(semanticsId, info.m1(), AndroidComposeView.this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Ljn0/h0;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<Configuration, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f5568c = new e();

        e() {
            super(1);
        }

        public final void a(Configuration configuration) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Configuration configuration) {
            a(configuration);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class f extends p013kotlin.jvm.internal.p implements wn0.a<androidx.compose.ui.platform.coreshims.d> {
        f(Object obj) {
            super(0, obj, h0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.coreshims.d invoke() {
            return h0.g((View) this.receiver);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ KeyEvent f5570d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(KeyEvent keyEvent) {
            super(0);
            this.f5570d = keyEvent;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f5570d));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class h extends p013kotlin.jvm.internal.p implements wn0.q<g3.h, j3.m, wn0.l<? super m3.f, ? extends jn0.h0>, Boolean> {
        h(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean a(g3.h hVar, long j11, wn0.l<? super m3.f, jn0.h0> lVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).P0(hVar, j11, lVar));
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Boolean invoke(g3.h hVar, j3.m mVar, wn0.l<? super m3.f, ? extends jn0.h0> lVar) {
            return a(hVar, mVar.getPackedValue(), lVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class i extends p013kotlin.jvm.internal.p implements wn0.l<wn0.a<? extends jn0.h0>, jn0.h0> {
        i(Object obj) {
            super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        public final void a(wn0.a<jn0.h0> aVar) {
            ((AndroidComposeView) this.receiver).v(aVar);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(wn0.a<? extends jn0.h0> aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class j extends p013kotlin.jvm.internal.p implements wn0.p<androidx.compose.ui.focus.d, j3.i, Boolean> {
        j(Object obj) {
            super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.focus.d dVar, j3.i iVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).A0(dVar, iVar));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class k extends p013kotlin.jvm.internal.p implements wn0.l<androidx.compose.ui.focus.d, Boolean> {
        k(Object obj) {
            super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        public final Boolean a(int i11) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).z0(i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.focus.d dVar) {
            return a(dVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class l extends p013kotlin.jvm.internal.p implements wn0.a<jn0.h0> {
        l(Object obj) {
            super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            o();
            return jn0.h0.f84049a;
        }

        public final void o() {
            ((AndroidComposeView) this.receiver).x0();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class m extends p013kotlin.jvm.internal.p implements wn0.a<j3.i> {
        m(Object obj) {
            super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final j3.i invoke() {
            return ((AndroidComposeView) this.receiver).y0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f5571c = new o();

        o() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt3/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.l<t3.b, Boolean> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f5573c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f5573c = dVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolK = androidx.compose.ui.focus.s.k(focusTargetNode, this.f5573c.getValue());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f5574c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f5574c = dVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolK = androidx.compose.ui.focus.s.k(focusTargetNode, this.f5574c.getValue());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        p() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            androidx.compose.ui.focus.d dVarJ0 = AndroidComposeView.this.j0(keyEvent);
            if (dVarJ0 == null || !t3.c.e(t3.d.b(keyEvent), t3.c.INSTANCE.a())) {
                return Boolean.FALSE;
            }
            j3.i iVarY0 = AndroidComposeView.this.y0();
            Boolean boolC = AndroidComposeView.this.getFocusOwner().c(dVarJ0.getValue(), iVarY0, new b(dVarJ0));
            if (boolC != null ? boolC.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.j.a(dVarJ0.getValue())) {
                return Boolean.FALSE;
            }
            Integer numC = androidx.compose.ui.focus.h.c(dVarJ0.getValue());
            if (numC == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            Rect rectA = iVarY0 != null ? z3.a(iVarY0) : null;
            if (rectA == null) {
                throw new IllegalStateException("Invalid rect");
            }
            View viewH0 = AndroidComposeView.this.h0(iIntValue);
            if (p013kotlin.jvm.internal.s.f(viewH0, AndroidComposeView.this)) {
                viewH0 = null;
            }
            if (viewH0 != null && androidx.compose.ui.focus.h.b(viewH0, Integer.valueOf(iIntValue), rectA)) {
                return Boolean.TRUE;
            }
            if (!AndroidComposeView.this.getFocusOwner().f(false, true, false, dVarJ0.getValue())) {
                return Boolean.TRUE;
            }
            Boolean boolC2 = AndroidComposeView.this.getFocusOwner().c(dVarJ0.getValue(), null, new a(dVarJ0));
            return Boolean.valueOf(boolC2 != null ? boolC2.booleanValue() : true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(t3.b bVar) {
            return a(bVar.getNativeKeyEvent());
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$q", "Lv3/u;", "Lv3/s;", "value", "Ljn0/h0;", "a", "(Lv3/s;)V", "Lv3/s;", "currentIcon", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class q implements v3.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private v3.s currentIcon = v3.s.INSTANCE.a();

        q() {
        }

        @Override // v3.u
        public void a(v3.s value) {
            if (value == null) {
                value = v3.s.INSTANCE.a();
            }
            this.currentIcon = value;
            f0.f5700a.a(AndroidComposeView.this, value);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.d f5578d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(androidx.compose.ui.viewinterop.d dVar) {
            super(0);
            this.f5578d = dVar;
        }

        public final void b() {
            AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f5578d);
            HashMap<b4.g0, androidx.compose.ui.viewinterop.d> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            p013kotlin.jvm.internal.u0.d(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f5578d));
            this.f5578d.setImportantForAccessibility(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i11) {
            super(1);
            this.f5579c = i11;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean boolK = androidx.compose.ui.focus.s.k(focusTargetNode, this.f5579c);
            return Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        t() {
            super(0);
        }

        public final void b() {
            MotionEvent motionEvent = AndroidComposeView.this.previousMotionEvent;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.relayoutTime = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.resendMotionEventRunnable);
                }
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$u", "Ljava/lang/Runnable;", "Ljn0/h0;", "run", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.previousMotionEvent;
            if (motionEvent != null) {
                boolean z11 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z11) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i11 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i11 = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.N0(motionEvent, i11, androidComposeView.relayoutTime, false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/b;", "it", "", "a", "(Lx3/b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class v extends p013kotlin.jvm.internal.u implements wn0.l<RotaryScrollEvent, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f5582c = new v();

        v() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "command", "b", "(Lwn0/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class w extends p013kotlin.jvm.internal.u implements wn0.l<wn0.a<? extends jn0.h0>, jn0.h0> {
        w() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(wn0.a aVar) {
            aVar.invoke();
        }

        public final void b(final wn0.a<jn0.h0> aVar) {
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.w.c(aVar);
                    }
                });
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(wn0.a<? extends jn0.h0> aVar) {
            b(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {592}, m = "textInputSession", n = {}, s = {})
    static final class x extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5584n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5586p;

        x(Continuation<? super x> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5584n = obj;
            this.f5586p |= Integer.MIN_VALUE;
            return AndroidComposeView.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/platform/j0;", "a", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/ui/platform/j0;"}, k = 3, mv = {1, 8, 0})
    static final class y extends p013kotlin.jvm.internal.u implements wn0.l<CoroutineScope, j0> {
        y() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke(CoroutineScope coroutineScope) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new j0(androidComposeView, androidComposeView.getTextInputService(), coroutineScope);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "b", "()Landroidx/compose/ui/platform/AndroidComposeView$b;"}, k = 3, mv = {1, 8, 0})
    static final class z extends p013kotlin.jvm.internal.u implements wn0.a<b> {
        z() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        super(context);
        j3.g.Companion companion = j3.g.INSTANCE;
        this.lastDownPointerPosition = companion.b();
        this.superclassInitComplete = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.sharedDrawScope = new b4.i0(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.density = p020r2.n3.h(w4.a.a(context), p020r2.n3.n());
        g4.f fVar = new g4.f();
        this.rootSemanticsNode = fVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(fVar);
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new FocusOwnerImpl(new i(this), new j(this), new k(this), new l(this), new m(this), new p013kotlin.jvm.internal.x(this) { // from class: androidx.compose.ui.platform.AndroidComposeView.n
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new h(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new n3();
        androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
        androidx.compose.ui.d dVarA = androidx.compose.ui.input.key.a.a(companion2, new p());
        this.keyInputModifier = dVarA;
        androidx.compose.ui.d dVarA2 = androidx.compose.ui.input.rotary.a.a(companion2, v.f5582c);
        this.rotaryInputModifier = dVarA2;
        this.canvasHolder = new k3.k1();
        b4.g0 g0Var = new b4.g0(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        g0Var.g(z3.a1.f126641b);
        g0Var.d(getDensity());
        g0Var.i(companion2.g(emptySemanticsElement).g(dVarA2).g(dVarA).g(getFocusOwner().getModifier()).g(dragAndDropModifierOnDragListener.getModifier()));
        this.root = g0Var;
        this.rootForTest = this;
        this.semanticsOwner = new g4.r(getRoot(), fVar);
        androidx.compose.ui.platform.w wVar = new androidx.compose.ui.platform.w(this);
        this.composeAccessibilityDelegate = wVar;
        this.contentCaptureManager = new f3.b(this, new f(this));
        this.accessibilityManager = new androidx.compose.ui.platform.j(context);
        this.graphicsContext = k3.j0.a(this);
        this.autofillTree = new e3.l();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new v3.h();
        this.pointerInputEventProcessor = new v3.b0(getRoot());
        this.configurationChangeObserver = e.f5568c;
        this._autofill = Z() ? new e3.c(this, getAutofillTree()) : null;
        this.clipboardManager = new androidx.compose.ui.platform.k(context);
        this.snapshotObserver = new b4.l1(new w());
        this.measureAndLayoutDelegate = new b4.r0(getRoot());
        this.viewConfiguration = new p0(ViewConfiguration.get(context));
        this.globalPosition = w4.o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] fArrC = k3.n3.c(null, 1, null);
        this.tmpMatrix = fArrC;
        this.viewToWindowMatrix = k3.n3.c(null, 1, null);
        this.windowToViewMatrix = k3.n3.c(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.a();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners = p020r2.s3.d(null, null, 2, null);
        this.viewTreeOwners = p020r2.n3.e(new z());
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.l0(this.f5872a);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.K0(this.f5889a);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                AndroidComposeView.Q0(this.f5896a, z11);
            }
        };
        o4.s0 s0Var = new o4.s0(getView(), this);
        this.legacyTextInputServiceAndroid = s0Var;
        this.textInputService = new o4.q0(h0.h().invoke(s0Var));
        this.textInputSessionMutex = d3.k.a();
        this.softwareKeyboardController = new b1(getTextInputService());
        this.fontLoader = new i0(context);
        this.fontFamilyResolver = p020r2.n3.h(p014n4.u.a(context), p020r2.n3.n());
        this.currentFontWeightAdjustment = k0(context.getResources().getConfiguration());
        w4.t tVarE = androidx.compose.ui.focus.h.e(context.getResources().getConfiguration().getLayoutDirection());
        this.layoutDirection = p020r2.s3.d(tVarE == null ? w4.t.Ltr : tVarE, null, 2, null);
        this.hapticFeedBack = new r3.c(this);
        this._inputModeManager = new s3.c(isInTouchMode() ? s3.a.INSTANCE.b() : s3.a.INSTANCE.a(), new c(), objArr2 == true ? 1 : 0);
        this.modifierLocalManager = new a4.f(this);
        this.textToolbar = new k0(this);
        this.layerCache = new l3<>();
        this.endApplyChangesListeners = new t2.b<>(new wn0.a[16], 0);
        this.resendMotionEventRunnable = new u();
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.q
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.L0(this.f5904a);
            }
        };
        this.resendMotionEventOnLayout = new t();
        int i11 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i11 < 29 ? new u0(fArrC, objArr == true ? 1 : 0) : new v0();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            g0.f5731a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.p0(this, wVar);
        wn0.l<k3, jn0.h0> lVarA = k3.INSTANCE.a();
        if (lVarA != null) {
            lVarA.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().s(this);
        if (i11 >= 29) {
            b0.f5658a.a(this);
        }
        this.scrollCapture = i11 >= 31 ? new f4.h() : null;
        this.pointerIconService = new q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0(androidx.compose.ui.focus.d focusDirection, j3.i previouslyFocusedRect) {
        Integer numC;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numC = androidx.compose.ui.focus.h.c(focusDirection.getValue())) == null) ? EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE : numC.intValue(), previouslyFocusedRect != null ? z3.a(previouslyFocusedRect) : null);
    }

    private final long B0(int a11, int b11) {
        return jn0.c0.b(jn0.c0.b(b11) | jn0.c0.b(jn0.c0.b(a11) << 32));
    }

    private final void C0() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            E0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f11 = iArr[0];
            float f12 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = j3.h.a(f11 - iArr2[0], f12 - iArr2[1]);
        }
    }

    private final void D0(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        E0();
        long jG = k3.n3.g(this.viewToWindowMatrix, j3.h.a(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = j3.h.a(motionEvent.getRawX() - j3.g.m(jG), motionEvent.getRawY() - j3.g.n(jG));
    }

    private final void E0() {
        this.matrixToWindow.a(this, this.viewToWindowMatrix);
        s1.a(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void I0(b4.g0 nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.e0() == b4.g0.g.InMeasureBlock && c0(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.n0();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void J0(AndroidComposeView androidComposeView, b4.g0 g0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = null;
        }
        androidComposeView.I0(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(AndroidComposeView androidComposeView) {
        androidComposeView.R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        p013kotlin.jvm.internal.s.h(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.M0(motionEvent);
    }

    private final int M0(MotionEvent motionEvent) {
        PointerInputEventData a0Var;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.b(v3.j0.b(motionEvent.getMetaState()));
        }
        v3.z zVarC = this.motionEventAdapter.c(motionEvent, this);
        if (zVarC == null) {
            this.pointerInputEventProcessor.c();
            return v3.c0.a(false, false);
        }
        List<PointerInputEventData> listB = zVarC.b();
        int size = listB.size() - 1;
        if (size < 0) {
            a0Var = null;
            break;
        }
        while (true) {
            int i11 = size - 1;
            a0Var = listB.get(size);
            if (a0Var.getDown()) {
                break;
            }
            if (i11 < 0) {
                a0Var = null;
                break;
            }
            size = i11;
        }
        PointerInputEventData a0Var2 = a0Var;
        if (a0Var2 != null) {
            this.lastDownPointerPosition = a0Var2.getPosition();
        }
        int iB = this.pointerInputEventProcessor.b(zVarC, this, u0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !v3.m0.c(iB)) {
            this.motionEventAdapter.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jW = w(j3.h.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = j3.g.m(jW);
            pointerCoords.y = j3.g.n(jW);
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        v3.z zVarC = this.motionEventAdapter.c(motionEventObtain, this);
        p013kotlin.jvm.internal.s.h(zVarC);
        this.pointerInputEventProcessor.b(zVarC, this, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void O0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i11, long j11, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        androidComposeView.N0(motionEvent, i11, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P0(g3.h transferData, long decorationSize, wn0.l<? super m3.f, jn0.h0> drawDragDecoration) {
        Resources resources = getContext().getResources();
        return c0.f5665a.a(this, transferData, new g3.a(w4.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), decorationSize, drawDragDecoration, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(AndroidComposeView androidComposeView, boolean z11) {
        androidComposeView._inputModeManager.b(z11 ? s3.a.INSTANCE.b() : s3.a.INSTANCE.a());
    }

    private final void R0() {
        getLocationOnScreen(this.tmpPositionArray);
        long j11 = this.globalPosition;
        int iH = w4.n.h(j11);
        int i11 = w4.n.i(j11);
        int[] iArr = this.tmpPositionArray;
        boolean z11 = false;
        int i12 = iArr[0];
        if (iH != i12 || i11 != iArr[1]) {
            this.globalPosition = w4.o.a(i12, iArr[1]);
            if (iH != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().V1();
                z11 = true;
            }
        }
        this.measureAndLayoutDelegate.c(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey) {
        int iE;
        if (p013kotlin.jvm.internal.s.f(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal())) {
            int iE2 = this.composeAccessibilityDelegate.getIdToBeforeMap().e(virtualViewId, -1);
            if (iE2 != -1) {
                info.getExtras().putInt(extraDataKey, iE2);
                return;
            }
            return;
        }
        if (!p013kotlin.jvm.internal.s.f(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal()) || (iE = this.composeAccessibilityDelegate.getIdToAfterMap().e(virtualViewId, -1)) == -1) {
            return;
        }
        info.getExtras().putInt(extraDataKey, iE);
    }

    private final boolean Z() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean c0(b4.g0 g0Var) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        b4.g0 g0VarN0 = g0Var.n0();
        return (g0VarN0 == null || g0VarN0.M()) ? false : true;
    }

    private final void d0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).l();
            } else if (childAt instanceof ViewGroup) {
                d0((ViewGroup) childAt);
            }
        }
    }

    private final long e0(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return B0(0, size);
        }
        if (mode == 0) {
            return B0(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return B0(size, size);
        }
        throw new IllegalStateException();
    }

    private final void f0() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    @jn0.e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final b get_viewTreeOwners() {
        return (b) this._viewTreeOwners.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View h0(int direction) {
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            p013kotlin.jvm.internal.s.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, direction);
            if (viewFindNextFocus != null && !h0.e(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final View i0(int accessibilityId, View currentView) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (p013kotlin.jvm.internal.s.f(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewI0 = i0(accessibilityId, viewGroup.getChildAt(i11));
                    if (viewI0 != null) {
                        return viewI0;
                    }
                }
            }
        }
        return null;
    }

    private final int k0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(AndroidComposeView androidComposeView) {
        androidComposeView.R0();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    private final int m0(MotionEvent motionEvent) {
        AndroidComposeView androidComposeView;
        int i11;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            D0(motionEvent);
            boolean z11 = true;
            this.forceUseMatrixCache = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z12 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null) {
                    try {
                        if (o0(motionEvent, motionEvent2)) {
                            if (t0(motionEvent2)) {
                                this.pointerInputEventProcessor.c();
                            } else if (motionEvent2.getActionMasked() != 10 && z12) {
                                O0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z13 = motionEvent.getToolType(0) == 3;
                if (z12 || !z13 || actionMasked == 3 || actionMasked == 9 || !u0(motionEvent)) {
                    androidComposeView = this;
                    i11 = 9;
                } else {
                    i11 = 9;
                    androidComposeView = this;
                    O0(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != 0) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = androidComposeView.previousMotionEvent;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = androidComposeView.previousMotionEvent;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i11 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            androidComposeView.motionEventAdapter.e(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = androidComposeView.previousMotionEvent;
                        float x11 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = androidComposeView.previousMotionEvent;
                        boolean z14 = (x11 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = androidComposeView.previousMotionEvent;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z11 = false;
                        }
                        if (z14 || z11) {
                            if (pointerId >= 0) {
                                androidComposeView.motionEventAdapter.e(pointerId);
                            }
                            androidComposeView.pointerInputEventProcessor.a();
                        }
                    }
                }
                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int iM0 = M0(motionEvent);
                Trace.endSection();
                androidComposeView.forceUseMatrixCache = false;
                return iM0;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            this.forceUseMatrixCache = false;
            throw th4;
        }
    }

    private final boolean n0(MotionEvent event) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f11 = -event.getAxisValue(26);
        return getFocusOwner().k(new RotaryScrollEvent(androidx.core.view.p0.j(viewConfiguration, getContext()) * f11, f11 * androidx.core.view.p0.f(viewConfiguration, getContext()), event.getEventTime(), event.getDeviceId()));
    }

    private final boolean o0(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final void q0(b4.g0 node) {
        node.E0();
        t2.b<b4.g0> bVarW0 = node.w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            b4.g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                q0(g0VarArrM[i11]);
                i11++;
            } while (i11 < iN);
        }
    }

    private final void r0(b4.g0 node) {
        int i11 = 0;
        b4.r0.H(this.measureAndLayoutDelegate, node, false, 2, null);
        t2.b<b4.g0> bVarW0 = node.w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            b4.g0[] g0VarArrM = bVarW0.m();
            do {
                r0(g0VarArrM[i11]);
                i11++;
            } while (i11 < iN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    private final boolean s0(MotionEvent event) {
        boolean z11;
        float x11 = event.getX();
        if (Float.isInfinite(x11) || Float.isNaN(x11)) {
            z11 = true;
        } else {
            float y11 = event.getY();
            if (Float.isInfinite(y11) || Float.isNaN(y11)) {
                z11 = true;
            } else {
                float rawX = event.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z11 = true;
                } else {
                    float rawY = event.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
        }
        if (!z11) {
            int pointerCount = event.getPointerCount();
            for (int i11 = 1; i11 < pointerCount; i11++) {
                float x12 = event.getX(i11);
                if (Float.isInfinite(x12) || Float.isNaN(x12)) {
                    z11 = true;
                } else {
                    float y12 = event.getY(i11);
                    if (Float.isInfinite(y12) || Float.isNaN(y12) || (Build.VERSION.SDK_INT >= 29 && !w1.f6065a.a(event, i11))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    break;
                }
            }
        }
        return z11;
    }

    private void setDensity(w4.d dVar) {
        this.density.setValue(dVar);
    }

    private void setFontFamilyResolver(n4.q.b bVar) {
        this.fontFamilyResolver.setValue(bVar);
    }

    private void setLayoutDirection(w4.t tVar) {
        this.layoutDirection.setValue(tVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this._viewTreeOwners.setValue(bVar);
    }

    private final boolean t0(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean u0(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        return BitmapDescriptorFactory.HUE_RED <= x11 && x11 <= ((float) getWidth()) && BitmapDescriptorFactory.HUE_RED <= y11 && y11 <= ((float) getHeight());
    }

    private final boolean v0(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j3.i y0() {
        if (isFocused()) {
            return getFocusOwner().o();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.h.a(viewFindFocus);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z0(int focusDirection) {
        androidx.compose.ui.focus.d.Companion companion = androidx.compose.ui.focus.d.INSTANCE;
        if (androidx.compose.ui.focus.d.l(focusDirection, companion.b()) || androidx.compose.ui.focus.d.l(focusDirection, companion.c())) {
            return false;
        }
        Integer numC = androidx.compose.ui.focus.h.c(focusDirection);
        if (numC == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        j3.i iVarY0 = y0();
        Rect rectA = iVarY0 != null ? z3.a(iVarY0) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rectA == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectA, iIntValue);
        if (viewFindNextFocus != null) {
            return androidx.compose.ui.focus.h.b(viewFindNextFocus, Integer.valueOf(iIntValue), rectA);
        }
        return false;
    }

    public final boolean F0(b4.i1 layer) {
        if (this.viewLayersContainer != null) {
            f3.INSTANCE.b();
        }
        this.layerCache.c(layer);
        return true;
    }

    public final void G0(androidx.compose.ui.viewinterop.d view) {
        v(new r(view));
    }

    public final void H0() {
        this.observationClearRequested = true;
    }

    public final void X(androidx.compose.ui.viewinterop.d view, b4.g0 layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        view.setImportantForAccessibility(1);
        ViewCompat.p0(view, new d(layoutNode, this));
    }

    @Override // b4.j1
    public void a(boolean sendPointerUpdate) {
        wn0.a<jn0.h0> aVar;
        if (this.measureAndLayoutDelegate.m() || this.measureAndLayoutDelegate.n()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    aVar = this.resendMotionEventOnLayout;
                } finally {
                    Trace.endSection();
                }
            } else {
                aVar = null;
            }
            if (this.measureAndLayoutDelegate.r(aVar)) {
                requestLayout();
            }
            b4.r0.d(this.measureAndLayoutDelegate, false, 1, null);
            f0();
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    public final Object a0(Continuation<? super jn0.h0> continuation) {
        Object objM = this.composeAccessibilityDelegate.M(continuation);
        return objM == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM : jn0.h0.f84049a;
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        addView(child, -1);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> values) {
        e3.c cVar;
        if (!Z() || (cVar = this._autofill) == null) {
            return;
        }
        e3.f.a(cVar, values);
    }

    @Override // b4.j1
    public void b(b4.g0 layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.C(layoutNode, forceRequest)) {
                J0(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.F(layoutNode, forceRequest)) {
            J0(this, null, 1, null);
        }
    }

    public final Object b0(Continuation<? super jn0.h0> continuation) {
        Object objB = this.contentCaptureManager.b(continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.h0.f84049a;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.N(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.N(true, direction, this.lastDownPointerPosition);
    }

    @Override // b4.j1
    public void d(b4.g0 layoutNode) {
        this.measureAndLayoutDelegate.E(layoutNode);
        J0(this, null, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            q0(getRoot());
        }
        b4.j1.u(this, false, 1, null);
        androidx.compose.runtime.snapshots.g.INSTANCE.n();
        this.isDrawingContent = true;
        k3.k1 k1Var = this.canvasHolder;
        Canvas canvasB = k1Var.getAndroidCanvas().getInternalCanvas();
        k1Var.getAndroidCanvas().z(canvas);
        getRoot().A(k1Var.getAndroidCanvas(), null);
        k1Var.getAndroidCanvas().z(canvasB);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.dirtyLayers.get(i11).n();
            }
        }
        if (f3.INSTANCE.b()) {
            int iSave = canvas.save();
            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<b4.i1> list = this.postponedDirtyLayers;
        if (list != null) {
            p013kotlin.jvm.internal.s.h(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (s0(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return motionEvent.isFromSource(4194304) ? n0(motionEvent) : v3.m0.c(m0(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (s0(event) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.V(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && u0(event)) {
                if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent = this.previousMotionEvent;
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                this.hoverExitReceived = true;
                postDelayed(this.sendHoverExitEvent, 8L);
                return false;
            }
        } else if (!v0(event)) {
            return false;
        }
        return v3.m0.c(m0(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!isFocused()) {
            return getFocusOwner().n(t3.b.b(event), new g(event));
        }
        this._windowInfo.b(v3.j0.b(event.getMetaState()));
        return i3.i.p(getFocusOwner(), t3.b.b(event), null, 2, null) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        return (isFocused() && getFocusOwner().d(t3.b.b(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        if (Build.VERSION.SDK_INT < 28) {
            a0.f5641a.a(structure, getView());
        } else {
            super.dispatchProvideStructure(structure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            p013kotlin.jvm.internal.s.h(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || o0(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (s0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !v0(motionEvent)) {
            return false;
        }
        int iM0 = m0(motionEvent);
        if (v3.m0.b(iM0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return v3.m0.c(iM0);
    }

    @Override // b4.j1
    public void e(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // b4.j1
    public b4.i1 f(wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock, wn0.a<jn0.h0> invalidateParentLayer, n3.c explicitLayer) {
        if (explicitLayer != null) {
            return new j1(explicitLayer, null, this, drawBlock, invalidateParentLayer);
        }
        b4.i1 i1VarB = this.layerCache.b();
        if (i1VarB != null) {
            i1VarB.o(drawBlock, invalidateParentLayer);
            return i1VarB;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new j1(getGraphicsContext().a(), getGraphicsContext(), this, drawBlock, invalidateParentLayer);
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new j2(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            f3.Companion cVar = f3.INSTANCE;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            g1 g1Var = cVar.b() ? new g1(getContext()) : new g3(getContext());
            this.viewLayersContainer = g1Var;
            addView(g1Var);
        }
        g1 g1Var2 = this.viewLayersContainer;
        p013kotlin.jvm.internal.s.h(g1Var2);
        return new f3(this, g1Var2, drawBlock, invalidateParentLayer);
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return i0(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        if (focused != null) {
            j3.i iVarA = androidx.compose.ui.focus.h.a(focused);
            androidx.compose.ui.focus.d dVarD = androidx.compose.ui.focus.h.d(direction);
            if (p013kotlin.jvm.internal.s.f(getFocusOwner().c(dVarD != null ? dVarD.getValue() : androidx.compose.ui.focus.d.INSTANCE.a(), iVarA, o.f5571c), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(focused, direction);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // b4.j1
    public Object g(wn0.p<? super f2, ? super Continuation<?>, ? extends Object> pVar, Continuation<?> continuation) {
        x xVar;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i11 = xVar.f5586p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f5586p = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(continuation);
            }
        } else {
            xVar = new x(continuation);
        }
        Object obj = xVar.f5584n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = xVar.f5586p;
        if (i12 == 0) {
            jn0.t.b(obj);
            AtomicReference atomicReference = this.textInputSessionMutex;
            y yVar = new y();
            xVar.f5586p = 1;
            if (d3.k.d(atomicReference, yVar, pVar, xVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void g0(androidx.compose.ui.viewinterop.d view, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(view, canvas);
    }

    public final r0 getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            r0 r0Var = new r0(getContext());
            this._androidViewsHandler = r0Var;
            addView(r0Var);
            requestLayout();
        }
        r0 r0Var2 = this._androidViewsHandler;
        p013kotlin.jvm.internal.s.h(r0Var2);
        return r0Var2;
    }

    @Override // b4.j1
    public e3.g getAutofill() {
        return this._autofill;
    }

    @Override // b4.j1
    public e3.l getAutofillTree() {
        return this.autofillTree;
    }

    public final wn0.l<Configuration, jn0.h0> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final f3.b getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // b4.j1
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // b4.j1
    public w4.d getDensity() {
        return (w4.d) this.density.getValue();
    }

    @Override // b4.j1
    public g3.c getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // b4.j1
    public i3.i getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        jn0.h0 h0Var;
        j3.i iVarY0 = y0();
        if (iVarY0 != null) {
            rect.left = Math.round(iVarY0.getLeft());
            rect.top = Math.round(iVarY0.getTop());
            rect.right = Math.round(iVarY0.getRight());
            rect.bottom = Math.round(iVarY0.getBottom());
            h0Var = jn0.h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // b4.j1
    public n4.q.b getFontFamilyResolver() {
        return (n4.q.b) this.fontFamilyResolver.getValue();
    }

    @Override // b4.j1
    public n4.p.b getFontLoader() {
        return this.fontLoader;
    }

    @Override // b4.j1
    public k3.g3 getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // b4.j1
    public r3.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.m();
    }

    @Override // b4.j1
    public s3.b getInputModeManager() {
        return this._inputModeManager;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, b4.j1
    public w4.t getLayoutDirection() {
        return (w4.t) this.layoutDirection.getValue();
    }

    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.q();
    }

    @Override // b4.j1
    public a4.f getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // b4.j1
    public z3.w0.a getPlacementScope() {
        return z3.x0.b(this);
    }

    @Override // b4.j1
    public v3.u getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // b4.j1
    public b4.g0 getRoot() {
        return this.root;
    }

    public b4.r1 getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        f4.h hVar;
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.scrollCapture) == null) {
            return false;
        }
        return hVar.c();
    }

    public g4.r getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // b4.j1
    public b4.i0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // b4.j1
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // b4.j1
    public b4.l1 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // b4.j1
    public r2 getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // b4.j1
    public o4.q0 getTextInputService() {
        return this.textInputService;
    }

    @Override // b4.j1
    public u2 getTextToolbar() {
        return this.textToolbar;
    }

    public View getView() {
        return this;
    }

    @Override // b4.j1
    public e3 getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final b getViewTreeOwners() {
        return (b) this.viewTreeOwners.getValue();
    }

    @Override // b4.j1
    public m3 getWindowInfo() {
        return this._windowInfo;
    }

    @Override // b4.j1
    public void h(b4.g0 node) {
        this.measureAndLayoutDelegate.v(node);
        H0();
    }

    @Override // b4.j1
    public long j(long positionInWindow) {
        C0();
        return k3.n3.g(this.windowToViewMatrix, positionInWindow);
    }

    public androidx.compose.ui.focus.d j0(KeyEvent keyEvent) {
        long jA = t3.d.a(keyEvent);
        t3.a.Companion companion = t3.a.INSTANCE;
        if (t3.a.q(jA, companion.m())) {
            return androidx.compose.ui.focus.d.i(t3.d.f(keyEvent) ? androidx.compose.ui.focus.d.INSTANCE.f() : androidx.compose.ui.focus.d.INSTANCE.e());
        }
        if (t3.a.q(jA, companion.f())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.INSTANCE.g());
        }
        if (t3.a.q(jA, companion.e())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.INSTANCE.d());
        }
        if (t3.a.q(jA, companion.g()) ? true : t3.a.q(jA, companion.l())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.INSTANCE.h());
        }
        if (t3.a.q(jA, companion.d()) ? true : t3.a.q(jA, companion.k())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.INSTANCE.a());
        }
        if (t3.a.q(jA, companion.c()) ? true : t3.a.q(jA, companion.h()) ? true : t3.a.q(jA, companion.j())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.INSTANCE.b());
        }
        if (t3.a.q(jA, companion.a()) ? true : t3.a.q(jA, companion.i())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.INSTANCE.c());
        }
        return null;
    }

    @Override // b4.j1
    public void k(b4.g0 layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.i(layoutNode, affectsLookahead);
    }

    @Override // b4.j1
    public void l() {
        if (this.observationClearRequested) {
            getSnapshotObserver().b();
            this.observationClearRequested = false;
        }
        r0 r0Var = this._androidViewsHandler;
        if (r0Var != null) {
            d0(r0Var);
        }
        while (this.endApplyChangesListeners.q()) {
            int iN = this.endApplyChangesListeners.getSize();
            for (int i11 = 0; i11 < iN; i11++) {
                wn0.a<jn0.h0> aVar = this.endApplyChangesListeners.m()[i11];
                this.endApplyChangesListeners.y(i11, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.endApplyChangesListeners.w(0, iN);
        }
    }

    @Override // b4.j1
    public long m(long localPosition) {
        C0();
        return k3.n3.g(this.viewToWindowMatrix, localPosition);
    }

    @Override // v3.l0
    public long n(long positionOnScreen) {
        C0();
        return k3.n3.g(this.windowToViewMatrix, j3.h.a(j3.g.m(positionOnScreen) - j3.g.m(this.windowPosition), j3.g.n(positionOnScreen) - j3.g.n(this.windowPosition)));
    }

    @Override // v3.l0
    public void o(float[] localTransform) {
        C0();
        k3.n3.p(localTransform, this.viewToWindowMatrix);
        h0.j(localTransform, j3.g.m(this.windowPosition), j3.g.n(this.windowPosition), this.tmpMatrix);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        e3.c cVar;
        super.onAttachedToWindow();
        this._windowInfo.c(hasWindowFocus());
        r0(getRoot());
        q0(getRoot());
        getSnapshotObserver().k();
        if (Z() && (cVar = this._autofill) != null) {
            e3.j.f61590a.a(cVar);
        }
        LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(this);
        xa.d dVarA = xa.e.a(this);
        b viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (lifecycleOwnerA != null && dVarA != null && (lifecycleOwnerA != viewTreeOwners.getLifecycleOwner() || dVarA != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwnerA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (dVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            lifecycleOwnerA.getLifecycle().a(this);
            b bVar = new b(lifecycleOwnerA, dVarA);
            set_viewTreeOwners(bVar);
            wn0.l<? super b, jn0.h0> lVar = this.onViewTreeOwnersAvailable;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.b(isInTouchMode() ? s3.a.INSTANCE.b() : s3.a.INSTANCE.a());
        b viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycleOwner2 = viewTreeOwners2.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 == null) {
            y3.a.c("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle2.a(this);
        lifecycle2.a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            e0.f5696a.b(this);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        j0 j0Var = (j0) d3.k.c(this.textInputSessionMutex);
        return j0Var == null ? this.legacyTextInputServiceAndroid.getEditorHasFocus() : j0Var.e();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setDensity(w4.a.a(getContext()));
        if (k0(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = k0(newConfig);
            setFontFamilyResolver(p014n4.u.a(getContext()));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        j0 j0Var = (j0) d3.k.c(this.textInputSessionMutex);
        return j0Var == null ? this.legacyTextInputServiceAndroid.o(outAttrs) : j0Var.d(outAttrs);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        this.contentCaptureManager.o(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        e3.c cVar;
        LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        b viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
        if (lifecycle == null) {
            y3.a.c("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle.d(this.contentCaptureManager);
        lifecycle.d(this);
        if (Z() && (cVar = this._autofill) != null) {
            e3.j.f61590a.b(cVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            e0.f5696a.a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus || hasFocus()) {
            return;
        }
        getFocusOwner().q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) throws Throwable {
        this.measureAndLayoutDelegate.r(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        R0();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r11 - l11, b11 - t11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                r0(getRoot());
            }
            long jE0 = e0(widthMeasureSpec);
            int iB = (int) jn0.c0.b(jE0 >>> 32);
            int iB2 = (int) jn0.c0.b(jE0 & 4294967295L);
            long jE1 = e0(heightMeasureSpec);
            long jA = w4.b.INSTANCE.a(iB, iB2, (int) jn0.c0.b(jE1 >>> 32), (int) jn0.c0.b(4294967295L & jE1));
            w4.b bVar = this.onMeasureConstraints;
            boolean zF = false;
            if (bVar == null) {
                this.onMeasureConstraints = w4.b.a(jA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (bVar != null) {
                    zF = w4.b.f(bVar.getValue(), jA);
                }
                if (!zF) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.I(jA);
            this.measureAndLayoutDelegate.t();
            setMeasuredDimension(getRoot().s0(), getRoot().N());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().s0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().N(), 1073741824));
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        e3.c cVar;
        if (!Z() || structure == null || (cVar = this._autofill) == null) {
            return;
        }
        e3.f.b(cVar, structure);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        setShowLayoutBounds(INSTANCE.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.superclassInitComplete) {
            w4.t tVarE = androidx.compose.ui.focus.h.e(layoutDirection);
            if (tVarE == null) {
                tVarE = w4.t.Ltr;
            }
            setLayoutDirection(tVarE);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect localVisibleRect, Point windowOffset, Consumer<ScrollCaptureTarget> targets) {
        f4.h hVar;
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.scrollCapture) == null) {
            return;
        }
        hVar.d(this, getSemanticsOwner(), getCoroutineContext(), targets);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> response) {
        f3.b bVar = this.contentCaptureManager;
        bVar.t(bVar, response);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean zB;
        this._windowInfo.c(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (zB = INSTANCE.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        p0();
    }

    public void p0() {
        q0(getRoot());
    }

    @Override // b4.j1
    public void q(b4.g0 layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.D(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                I0(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.G(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            I0(layoutNode);
        }
    }

    @Override // b4.j1
    public void r(b4.g0 layoutNode) {
        this.composeAccessibilityDelegate.t0(layoutNode);
        this.contentCaptureManager.q(layoutNode);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().m().getHasFocus()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        androidx.compose.ui.focus.d dVarD = androidx.compose.ui.focus.h.d(direction);
        int value = dVarD != null ? dVarD.getValue() : androidx.compose.ui.focus.d.INSTANCE.b();
        Boolean boolC = getFocusOwner().c(value, previouslyFocusedRect != null ? z3.e(previouslyFocusedRect) : null, new s(value));
        if (boolC != null) {
            return boolC.booleanValue();
        }
        return false;
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.composeAccessibilityDelegate.S0(intervalMillis);
    }

    public final void setConfigurationChangeObserver(wn0.l<? super Configuration, jn0.h0> lVar) {
        this.configurationChangeObserver = lVar;
    }

    public final void setContentCaptureManager$ui_release(f3.b bVar) {
        this.contentCaptureManager = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        b4.j head = getRoot().getNodes().getHead();
        if (head instanceof v3.q0) {
            ((v3.q0) head).o1();
        }
        int iA = b4.b1.a(16);
        if (!head.getNode().getIsAttached()) {
            y3.a.b("visitSubtree called on an unattached node");
        }
        androidx.compose.ui.d.c child = head.getNode().getChild();
        b4.g0 g0VarM = b4.k.m(head);
        b4.w0 w0Var = new b4.w0();
        while (g0VarM != null) {
            if (child == null) {
                child = g0VarM.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & iA) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = child;
                        t2.b bVar = null;
                        while (cVarG != 0) {
                            if (cVarG instanceof b4.p1) {
                                b4.p1 p1Var = (b4.p1) cVarG;
                                if (p1Var instanceof v3.q0) {
                                    ((v3.q0) p1Var).o1();
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                androidx.compose.ui.d.c cVarY2 = ((b4.m) cVarG).getDelegate();
                                int i11 = 0;
                                cVarG = cVarG;
                                while (cVarY2 != null) {
                                    if ((cVarY2.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarY2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != 0) {
                                                bVar.b(cVarG);
                                                cVarG = 0;
                                            }
                                            bVar.b(cVarY2);
                                        }
                                    }
                                    cVarY2 = cVarY2.getChild();
                                    cVarG = cVarG;
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar);
                        }
                    }
                    child = child.getChild();
                }
            }
            w0Var.c(g0VarM.w0());
            g0VarM = w0Var.a() ? (b4.g0) w0Var.b() : null;
            child = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j11) {
        this.lastMatrixRecalculationAnimationTime = j11;
    }

    public final void setOnViewTreeOwnersAvailable(wn0.l<? super b, jn0.h0> callback) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    @Override // b4.j1
    public void setShowLayoutBounds(boolean z11) {
        this.showLayoutBounds = z11;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // b4.j1
    public void t(b4.j1.b listener) {
        this.measureAndLayoutDelegate.x(listener);
        J0(this, null, 1, null);
    }

    @Override // b4.j1
    public void v(wn0.a<jn0.h0> listener) {
        if (this.endApplyChangesListeners.i(listener)) {
            return;
        }
        this.endApplyChangesListeners.b(listener);
    }

    @Override // v3.l0
    public long w(long localPosition) {
        C0();
        long jG = k3.n3.g(this.viewToWindowMatrix, localPosition);
        return j3.h.a(j3.g.m(jG) + j3.g.m(this.windowPosition), j3.g.n(jG) + j3.g.n(this.windowPosition));
    }

    public final void w0(b4.i1 layer, boolean isDirty) {
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            List<b4.i1> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        List arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(layer);
    }

    @Override // b4.j1
    public void x() {
        this.composeAccessibilityDelegate.u0();
        this.contentCaptureManager.r();
    }

    @Override // b4.j1
    public void y(b4.g0 layoutNode, long constraints) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.s(layoutNode, constraints);
            if (!this.measureAndLayoutDelegate.m()) {
                b4.r0.d(this.measureAndLayoutDelegate, false, 1, null);
                f0();
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        p013kotlin.jvm.internal.s.h(child);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(child, index, layoutParams);
    }

    @Override // b4.j1
    public androidx.compose.ui.platform.j getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // b4.j1
    public androidx.compose.ui.platform.k getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = width;
        layoutParamsGenerateDefaultLayoutParams.height = height;
        jn0.h0 h0Var = jn0.h0.f84049a;
        addView(child, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        addView(child, -1, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        addViewInLayout(child, index, params, true);
    }

    @Override // b4.j1
    public void s(b4.g0 node) {
    }
}
