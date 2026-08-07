package expo.modules.kotlin.views;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import co0.q;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.defaultmodules.ErrorManagerModule;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.DefinitionMarker;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.r;
import wn0.t;
import wn0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\u001c2\u0014\b\u0004\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J5\u0010!\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00028\u00002\u0014\b\b\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010\"J)\u0010%\u001a\u00020\u001c2\u0014\b\u0004\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010\"J5\u0010%\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00028\u00002\u0014\b\b\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010\"J?\u0010)\u001a\u00020\u001c\"\u0006\b\u0001\u0010'\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\b\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*JK\u0010)\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\b\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c0\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010*JS\u0010)\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010,\u001a\u00028\u00022\u001a\b\b\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c0\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010-J}\u00103\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u0001\"\u0006\b\u0003\u0010.\u0018\u00012*\u00101\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0003000/\"\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0003002 \b\b\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c02H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104J]\u00103\u001a\u00020\u001c\"\n\b\u0001\u0010#\u0018\u0001*\u00020\u0001\"\u0006\b\u0002\u0010'\u0018\u00012\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0/\"\u00020\u001a2 \b\b\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001c02H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00106J!\u00108\u001a\u00020\u001c2\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0/\"\u00020\u001a¢\u0006\u0004\b8\u00109J\u001d\u00108\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0/H\u0007¢\u0006\u0004\b:\u00109J9\u0010>\u001a\u00020\u001c\"\n\b\u0001\u0010<\u0018\u0001*\u00020;2\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010=\u0012\u0004\u0012\u00020\u001c0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b>\u0010\"J-\u0010C\u001a\u00020@2\u0006\u0010(\u001a\u00020\u001a2\u0010\b\u0004\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030?H\u0087\bø\u0001\u0000¢\u0006\u0004\bA\u0010BJ3\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u000e\b\u0004\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010?H\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010BJA\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u0014\b\u0004\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010FJO\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\u0004\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00010\fH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010HJG\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2\u001a\b\u0004\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010\fH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010HJ]\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2 \b\u0004\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u000102H\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010LJU\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2 \b\u0004\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u000102H\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010LJk\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2&\b\u0004\u0010 \u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00010NH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010OJc\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2&\b\u0004\u0010 \u001a \u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010NH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010OJy\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2,\b\u0004\u0010 \u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00010QH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010RJq\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2,\b\u0004\u0010 \u001a&\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010QH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010RJ\u0087\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u00012\u0006\u0010(\u001a\u00020\u001a22\b\u0004\u0010 \u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00010TH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010UJ\u007f\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u00012\u0006\u0010(\u001a\u00020\u001a22\b\u0004\u0010 \u001a,\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010TH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010UJ\u0095\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u0001\"\u0006\b\b\u0010V\u0018\u00012\u0006\u0010(\u001a\u00020\u001a28\b\u0004\u0010 \u001a2\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00010WH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010XJ\u008d\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u00012\u0006\u0010(\u001a\u00020\u001a28\b\u0004\u0010 \u001a2\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010WH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010XJ£\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u0001\"\u0006\b\b\u0010V\u0018\u0001\"\u0006\b\t\u0010Y\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2>\b\u0004\u0010 \u001a8\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\u00010ZH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010[J\u009b\u0001\u0010C\u001a\u00020@\"\u0006\b\u0001\u0010D\u0018\u0001\"\u0006\b\u0002\u0010E\u0018\u0001\"\u0006\b\u0003\u0010G\u0018\u0001\"\u0006\b\u0004\u0010K\u0018\u0001\"\u0006\b\u0005\u0010M\u0018\u0001\"\u0006\b\u0006\u0010P\u0018\u0001\"\u0006\b\u0007\u0010S\u0018\u0001\"\u0006\b\b\u0010V\u0018\u00012\u0006\u0010(\u001a\u00020\u001a2>\b\u0004\u0010 \u001a8\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00028\u00010ZH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010[J\u0015\u0010C\u001a\u00020\\2\u0006\u0010(\u001a\u00020\u001a¢\u0006\u0004\bC\u0010]R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`R \u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010c\u0012\u0004\bf\u0010b\u001a\u0004\bd\u0010eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010g\u0012\u0004\bj\u0010b\u001a\u0004\bh\u0010iR*\u0010(\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010k\u0012\u0004\bo\u0010b\u001a\u0004\bl\u0010m\"\u0004\bn\u0010\u001eR4\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020q0p8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b1\u0010r\u0012\u0004\bw\u0010b\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR6\u0010x\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bx\u0010y\u0012\u0004\b}\u0010b\u001a\u0004\bz\u0010{\"\u0004\b|\u0010\"R8\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u001a\n\u0004\b~\u0010y\u0012\u0005\b\u0081\u0001\u0010b\u001a\u0004\b\u007f\u0010{\"\u0005\b\u0080\u0001\u0010\"R3\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u0012\u0005\b\u0089\u0001\u0010b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R9\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020@0p8\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\b\u008d\u0001\u0010r\u0012\u0005\b\u0090\u0001\u0010b\u001a\u0005\b\u008e\u0001\u0010t\"\u0005\b\u008f\u0001\u0010vR$\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\\0p8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0092\u0001"}, d2 = {"Lexpo/modules/kotlin/views/ViewDefinitionBuilder;", "Landroid/view/View;", "T", "", "Lco0/d;", "viewClass", "Lco0/q;", "viewType", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Lco0/d;Lco0/q;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lkotlin/Function2;", "Landroid/content/Context;", "Lexpo/modules/kotlin/AppContext;", "createViewFactory", "()Lwn0/p;", CoreConstants.CONTEXT_SCOPE_VALUE, "appContext", "", AnalyticsAttribute.Error, "handleFailureDuringViewCreation", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;Ljava/lang/Throwable;)Landroid/view/View;", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "build", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", "", "viewName", "Ljn0/h0;", "Name", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "body", "OnViewDestroys", "(Lwn0/l;)V", "ViewType", "OnViewDestroysGeneric", "OnViewDidUpdateProps", "OnViewDidUpdatePropsGeneric", "PropType", "name", "Prop", "(Ljava/lang/String;Lwn0/p;)V", "PropGeneric", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;Lwn0/p;)V", "CustomValueType", "", "Lkotlin/Pair;", "props", "Lkotlin/Function3;", "PropGroup", "([Lkotlin/Pair;Lwn0/q;)V", "", "([Ljava/lang/String;Lwn0/q;)V", "callbacks", "Events", "([Ljava/lang/String;)V", "EventsWithArray", "Landroid/view/ViewGroup;", "ParentType", "Lexpo/modules/kotlin/views/ViewGroupDefinitionBuilder;", "GroupView", "Lkotlin/Function0;", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunctionWithoutArgs", "(Ljava/lang/String;Lwn0/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunction", "R", "P0", "(Ljava/lang/String;Lwn0/l;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P1", "(Ljava/lang/String;Lwn0/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "P2", "(Ljava/lang/String;Lwn0/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Ljava/lang/String;Lwn0/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Ljava/lang/String;Lwn0/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Ljava/lang/String;Lwn0/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Ljava/lang/String;Lwn0/u;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Ljava/lang/String;Lwn0/v;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "Lco0/d;", "getViewClass", "()Lco0/d;", "getViewClass$annotations", "()V", "Lco0/q;", "getViewType", "()Lco0/q;", "getViewType$annotations", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters$annotations", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "getName$annotations", "", "Lexpo/modules/kotlin/views/AnyViewProp;", "Ljava/util/Map;", "getProps", "()Ljava/util/Map;", "setProps", "(Ljava/util/Map;)V", "getProps$annotations", "onViewDestroys", "Lwn0/l;", "getOnViewDestroys", "()Lwn0/l;", "setOnViewDestroys", "getOnViewDestroys$annotations", "onViewDidUpdateProps", "getOnViewDidUpdateProps", "setOnViewDidUpdateProps", "getOnViewDidUpdateProps$annotations", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "setViewGroupDefinition", "(Lexpo/modules/kotlin/views/ViewGroupDefinition;)V", "getViewGroupDefinition$annotations", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "callbacksDefinition", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "asyncFunctions", "getAsyncFunctions", "setAsyncFunctions", "getAsyncFunctions$annotations", "functionBuilders", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DefinitionMarker
public final class ViewDefinitionBuilder<T extends View> {
    private Map<String, AsyncFunctionComponent> asyncFunctions;
    private CallbacksDefinition callbacksDefinition;
    private final TypeConverterProvider converters;
    private Map<String, AsyncFunctionBuilder> functionBuilders;
    private String name;
    private l<? super View, h0> onViewDestroys;
    private l<? super View, h0> onViewDidUpdateProps;
    private Map<String, AnyViewProp> props;
    private final co0.d<T> viewClass;
    private ViewGroupDefinition viewGroupDefinition;
    private final q viewType;

    /* JADX WARN: Unknown type variable: P0 in type: wn0.l<P0, R> */
    /* JADX WARN: Unknown type variable: R in type: wn0.l<P0, R> */
    /* JADX INFO: renamed from: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass5 implements p<Object[], Promise, h0> {
        final /* synthetic */ l<P0, R> $body;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: P0 in type: wn0.l<? super P0, ? extends R> */
        /* JADX WARN: Unknown type variable: R in type: wn0.l<? super P0, ? extends R> */
        public AnonymousClass5(l<? super P0, ? extends R> lVar) {
            this.$body = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object[] objArr, Promise promise) {
            s.k(objArr, "<unused var>");
            s.k(promise, "promise");
            l<P0, R> lVar = this.$body;
            s.q(1, "P0");
            lVar.invoke((P0) promise);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
            invoke2(objArr, promise);
            return h0.f84049a;
        }
    }

    public ViewDefinitionBuilder(co0.d<T> viewClass, q viewType, TypeConverterProvider typeConverterProvider) {
        s.k(viewClass, "viewClass");
        s.k(viewType, "viewType");
        this.viewClass = viewClass;
        this.viewType = viewType;
        this.converters = typeConverterProvider;
        this.name = viewClass.l();
        this.props = new LinkedHashMap();
        this.asyncFunctions = new LinkedHashMap();
        this.functionBuilders = new LinkedHashMap();
    }

    private final p<Context, AppContext, View> createViewFactory() {
        return new p() { // from class: expo.modules.kotlin.views.d
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return ViewDefinitionBuilder.createViewFactory$lambda$25(this.f63392a, (Context) obj, (AppContext) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createViewFactory$lambda$25(ViewDefinitionBuilder viewDefinitionBuilder, Context context, AppContext appContext) {
        Constructor constructor;
        s.k(context, "context");
        s.k(appContext, "appContext");
        Constructor constructor2 = null;
        try {
            constructor = vn0.a.b(viewDefinitionBuilder.viewClass).getConstructor(Context.class, AppContext.class);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        if (constructor != null) {
            try {
                return (View) constructor.newInstance(context, appContext);
            } catch (Throwable th2) {
                return viewDefinitionBuilder.handleFailureDuringViewCreation(context, appContext, th2);
            }
        }
        try {
            constructor2 = vn0.a.b(viewDefinitionBuilder.viewClass).getConstructor(Context.class);
        } catch (NoSuchMethodException unused2) {
        }
        if (constructor2 != null) {
            try {
                return (View) constructor2.newInstance(context);
            } catch (Throwable th3) {
                return viewDefinitionBuilder.handleFailureDuringViewCreation(context, appContext, th3);
            }
        }
        throw new IllegalStateException("Didn't find a correct constructor for " + viewDefinitionBuilder.viewClass);
    }

    public static /* synthetic */ void getAsyncFunctions$annotations() {
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOnViewDestroys$annotations() {
    }

    public static /* synthetic */ void getOnViewDidUpdateProps$annotations() {
    }

    public static /* synthetic */ void getProps$annotations() {
    }

    public static /* synthetic */ void getViewClass$annotations() {
    }

    public static /* synthetic */ void getViewGroupDefinition$annotations() {
    }

    public static /* synthetic */ void getViewType$annotations() {
    }

    private final View handleFailureDuringViewCreation(Context context, AppContext appContext, Throwable error) {
        Log.e("ExpoModulesCore", "Couldn't create view of type " + this.viewClass, error);
        ErrorManagerModule errorManager = appContext.getErrorManager();
        if (errorManager != null) {
            CodedException unexpectedException = error instanceof CodedException ? (CodedException) error : null;
            if (unexpectedException == null) {
                unexpectedException = new UnexpectedException(error);
            }
            errorManager.reportExceptionToLogBox(unexpectedException);
        }
        return ViewGroup.class.isAssignableFrom(vn0.a.b(this.viewClass)) ? new ErrorGroupView(context) : new ErrorView(context);
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncFunction(String name, final wn0.a<? extends R> body) {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.3
            @Override // wn0.l
            public final R invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            stringAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            stringAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            stringAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            stringAsyncFunctionComponent = s.f(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, lVar) : new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        getAsyncFunctions().put(name, stringAsyncFunctionComponent);
        return stringAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final p<? super P0, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.10
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.invoke((P0) objArr[0], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final AsyncFunctionComponent AsyncFunctionWithoutArgs(String name, final wn0.a<? extends Object> body) {
        s.k(name, "name");
        s.k(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, new AnyType[0], new l<Object[], Object>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.1
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final void Events(String... callbacks) {
        s.k(callbacks, "callbacks");
        this.callbacksDefinition = new CallbacksDefinition(callbacks);
    }

    public final void EventsWithArray(String[] callbacks) {
        s.k(callbacks, "callbacks");
        this.callbacksDefinition = new CallbacksDefinition(callbacks);
    }

    public final /* synthetic */ <ParentType extends ViewGroup> void GroupView(l<? super ViewGroupDefinitionBuilder<ParentType>, h0> body) {
        s.k(body, "body");
        co0.d<T> viewClass = getViewClass();
        s.q(4, "ParentType");
        s.f(viewClass, o0.b(ViewGroup.class));
        if (getViewGroupDefinition() != null) {
            throw new IllegalArgumentException("The viewManager definition may have exported only one groupView definition.");
        }
        ViewGroupDefinitionBuilder viewGroupDefinitionBuilder = new ViewGroupDefinitionBuilder();
        body.invoke(viewGroupDefinitionBuilder);
        setViewGroupDefinition(viewGroupDefinitionBuilder.build());
    }

    public final void Name(String viewName) {
        s.k(viewName, "viewName");
        this.name = viewName;
    }

    public final void OnViewDestroys(final l<? super T, h0> body) {
        s.k(body, "body");
        setOnViewDestroys(new l<View, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDestroys.1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(View view) {
                invoke2(view);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                s.k(it, "it");
                body.invoke(it);
            }
        });
    }

    public final /* synthetic */ <ViewType extends T> void OnViewDestroysGeneric(final l<? super ViewType, h0> body) {
        s.k(body, "body");
        s.p();
        setOnViewDestroys(new l<View, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDestroys.2
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(View view) {
                invoke2(view);
                return h0.f84049a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                s.k(it, "it");
                l<ViewType, h0> lVar = body;
                s.q(1, "ViewType");
                lVar.invoke((ViewType) it);
            }
        });
    }

    public final void OnViewDidUpdateProps(final l<? super T, h0> body) {
        s.k(body, "body");
        setOnViewDidUpdateProps(new l<View, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDidUpdateProps.1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(View view) {
                invoke2(view);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                s.k(it, "it");
                body.invoke(it);
            }
        });
    }

    public final /* synthetic */ <ViewType extends T> void OnViewDidUpdatePropsGeneric(final l<? super ViewType, h0> body) {
        s.k(body, "body");
        s.p();
        setOnViewDidUpdateProps(new l<View, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.OnViewDidUpdateProps.2
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(View view) {
                invoke2(view);
                return h0.f84049a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                s.k(it, "it");
                l<ViewType, h0> lVar = body;
                s.q(1, "ViewType");
                lVar.invoke((ViewType) it);
            }
        });
    }

    public final /* synthetic */ <PropType> void Prop(String name, p<? super T, ? super PropType, h0> body) {
        s.k(name, "name");
        s.k(body, "body");
        Map<String, AnyViewProp> props = getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "PropType");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "PropType");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$1 viewDefinitionBuilder$Prop$$inlined$toAnyType$default$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "PropType");
                    return null;
                }
            };
            s.q(4, "PropType");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "PropType");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$Prop$$inlined$toAnyType$default$1), null);
        }
        props.put(name, new ConcreteViewProp(name, anyType, body));
    }

    public final /* synthetic */ <ViewType extends View, PropType> void PropGeneric(String name, p<? super ViewType, ? super PropType, h0> body) {
        s.k(name, "name");
        s.k(body, "body");
        Map<String, AnyViewProp> props = getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "PropType");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "PropType");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$2 viewDefinitionBuilder$Prop$$inlined$toAnyType$default$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "PropType");
                    return null;
                }
            };
            s.q(4, "PropType");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "PropType");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$Prop$$inlined$toAnyType$default$2), null);
        }
        props.put(name, new ConcreteViewProp(name, anyType, body));
    }

    public final /* synthetic */ <ViewType extends View, PropType, CustomValueType> void PropGroup(Pair<String, ? extends CustomValueType>[] props, final wn0.q<? super ViewType, ? super CustomValueType, ? super PropType, h0> body) {
        s.k(props, "props");
        s.k(body, "body");
        for (Pair<String, ? extends CustomValueType> pair : props) {
            String strA = pair.a();
            final CustomValueType customvaluetypeB = pair.b();
            s.p();
            p<ViewType, PropType, h0> pVar = new p<ViewType, PropType, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.PropGroup.1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object obj, Object obj2) {
                    invoke((View) obj, obj2);
                    return h0.f84049a;
                }

                /* JADX WARN: Incorrect types in method signature: (TViewType;TPropType;)V */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v1 boolean
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                    */
                public final void invoke(android.view.View r3, java.lang.Object r4) {
                    /*
                        r2 = this;
                        java.lang.String r0 = "view"
                        p013kotlin.jvm.internal.s.k(r3, r0)
                        wn0.q<ViewType, CustomValueType, PropType, jn0.h0> r0 = r1
                        CustomValueType r1 = r2
                        r0.invoke(r3, r1, r4)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.views.ViewDefinitionBuilder.C46551.invoke(android.view.View, java.lang.Object):void");
                }
            };
            Map<String, AnyViewProp> props2 = getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            s.q(4, "PropType");
            co0.d dVarB = o0.b(Object.class);
            s.q(3, "PropType");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                s.p();
                ViewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1 viewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        s.q(6, "PropType");
                        return null;
                    }
                };
                s.q(4, "PropType");
                co0.d dVarB2 = o0.b(Object.class);
                s.q(3, "PropType");
                anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$PropGroup$$inlined$PropGeneric$1), null);
            }
            props2.put(strA, new ConcreteViewProp(strA, anyType, pVar));
        }
    }

    public final ViewManagerDefinition build() {
        Map<String, AsyncFunctionComponent> map = this.asyncFunctions;
        Map<String, AsyncFunctionBuilder> map2 = this.functionBuilders;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((AsyncFunctionBuilder) entry.getValue()).build$expo_modules_core_release());
        }
        Map mapR = v0.r(map, linkedHashMap);
        Iterator it2 = mapR.entrySet().iterator();
        while (it2.hasNext()) {
            BaseAsyncFunctionComponent baseAsyncFunctionComponent = (BaseAsyncFunctionComponent) ((Map.Entry) it2.next()).getValue();
            baseAsyncFunctionComponent.runOnQueue(Queues.MAIN);
            baseAsyncFunctionComponent.setOwnerType(this.viewType);
            baseAsyncFunctionComponent.setCanTakeOwner(true);
        }
        return new ViewManagerDefinition(this.name, createViewFactory(), vn0.a.b(this.viewClass), this.props, this.onViewDestroys, this.callbacksDefinition, this.viewGroupDefinition, this.onViewDidUpdateProps, v.m1(mapR.values()));
    }

    public final Map<String, AsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final String getName() {
        return this.name;
    }

    public final l<View, h0> getOnViewDestroys() {
        return this.onViewDestroys;
    }

    public final l<View, h0> getOnViewDidUpdateProps() {
        return this.onViewDidUpdateProps;
    }

    public final Map<String, AnyViewProp> getProps() {
        return this.props;
    }

    public final co0.d<T> getViewClass() {
        return this.viewClass;
    }

    public final ViewGroupDefinition getViewGroupDefinition() {
        return this.viewGroupDefinition;
    }

    public final q getViewType() {
        return this.viewType;
    }

    public final void setAsyncFunctions(Map<String, AsyncFunctionComponent> map) {
        s.k(map, "<set-?>");
        this.asyncFunctions = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOnViewDestroys(l<? super View, h0> lVar) {
        this.onViewDestroys = lVar;
    }

    public final void setOnViewDidUpdateProps(l<? super View, h0> lVar) {
        this.onViewDidUpdateProps = lVar;
    }

    public final void setProps(Map<String, AnyViewProp> map) {
        s.k(map, "<set-?>");
        this.props = map;
    }

    public final void setViewGroupDefinition(ViewGroupDefinition viewGroupDefinition) {
        this.viewGroupDefinition = viewGroupDefinition;
    }

    public /* synthetic */ ViewDefinitionBuilder(co0.d dVar, q qVar, TypeConverterProvider typeConverterProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, qVar, (i11 & 4) != 0 ? null : typeConverterProvider);
    }

    public final /* synthetic */ <ViewType extends View, PropType> void PropGeneric(String name, PropType defaultValue, p<? super ViewType, ? super PropType, h0> body) {
        s.k(name, "name");
        s.k(body, "body");
        Map<String, AnyViewProp> props = getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "PropType");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "PropType");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$3 viewDefinitionBuilder$Prop$$inlined$toAnyType$default$3 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$Prop$$inlined$toAnyType$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "PropType");
                    return null;
                }
            };
            s.q(4, "PropType");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "PropType");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$Prop$$inlined$toAnyType$default$3), null);
        }
        props.put(name, new ConcreteViewPropWithDefault(name, anyType, body, defaultValue));
    }

    public final /* synthetic */ <ViewType extends View, PropType> void PropGroup(String[] props, final wn0.q<? super ViewType, ? super Integer, ? super PropType, h0> body) {
        s.k(props, "props");
        s.k(body, "body");
        int length = props.length;
        int i11 = 0;
        final int i12 = 0;
        while (i11 < length) {
            String str = props[i11];
            int i13 = i12 + 1;
            s.p();
            p<ViewType, PropType, h0> pVar = new p<ViewType, PropType, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$PropGroup$2$1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object obj, Object obj2) {
                    invoke((View) obj, obj2);
                    return h0.f84049a;
                }

                /* JADX WARN: Incorrect types in method signature: (TViewType;TPropType;)V */
                public final void invoke(View view, Object obj) {
                    s.k(view, "view");
                    body.invoke(view, Integer.valueOf(i12), obj);
                }
            };
            Map<String, AnyViewProp> props2 = getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            s.q(4, "PropType");
            co0.d dVarB = o0.b(Object.class);
            s.q(3, "PropType");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                s.p();
                s.p();
                ViewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1 viewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        s.q(6, "PropType");
                        return null;
                    }
                };
                s.q(4, "PropType");
                co0.d dVarB2 = o0.b(Object.class);
                s.q(3, "PropType");
                anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$PropGroup$$inlined$forEachIndexed$lambda$1), null);
            }
            props2.put(str, new ConcreteViewProp(str, anyType, pVar));
            i11++;
            i12 = i13;
        }
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunction(String name, final l<? super P0, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1), null);
        }
        AnyType[] anyTypeArr = {anyType};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.6
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final wn0.q<? super P0, ? super P1, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.14
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.invoke((P0) objArr[0], (P1) objArr[1], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final r<? super P0, ? super P1, ? super P2, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.18
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunction(String name, final p<? super P0, ? super P1, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.8
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.22
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.d((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunction(String name, final wn0.q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.12
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Promise, ? extends R> body) {
        int i11;
        int i12;
        int i13;
        int i14;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32), converters);
        } else {
            i11 = 3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i12 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33), converters);
        } else {
            i12 = 3;
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i12, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34), converters);
        } else {
            i13 = 3;
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i13, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i14 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35), converters);
        } else {
            i14 = 3;
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i14, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.26
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.i((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunction(String name, final r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.16
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Promise, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        AnyType anyType6;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44), converters);
        } else {
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(r13);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(r13);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r13);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(r13);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r13);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(r13);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r13);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(r13);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r13);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49), converters);
        } else {
            anyType6 = anyType12;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.30
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.k((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunction(String name, final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20), converters);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.20
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.d((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final wn0.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Promise, ? extends R> body) {
        Class cls;
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        AnyType anyType7;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58), converters);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(cls);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64), converters);
        } else {
            anyType7 = anyType14;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.34
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.g((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunction(String name, final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        AnyType anyType6;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26), converters);
        } else {
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            i21 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31), converters);
        } else {
            i21 = 3;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.24
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.i((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5]);
            }
        };
        s.q(i21, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunction(String name, final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        AnyType anyType7;
        String str;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37), converters);
        } else {
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(Object.class);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            i23 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43), converters);
        } else {
            i23 = 3;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.28
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.k((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6]);
            }
        };
        s.q(i23, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            str = name;
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, lVar);
        } else {
            str = name;
            if (s.f(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str, anyTypeArr, lVar);
            }
        }
        getAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent AsyncFunction(String name, final wn0.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        int i24;
        AnyType anyType7;
        int i25;
        AnyType anyType8;
        String str;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        s.q(4, "P7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50), converters);
        } else {
            i11 = 3;
            anyType = anyType9;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(r14);
        s.q(i11, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(r14);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType10;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(r14);
        s.q(i13, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r14);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType11;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(r14);
        s.q(i15, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r14);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType12;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(r14);
        s.q(i17, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r14);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType13;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(r14);
        s.q(i19, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r14);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType14;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(r14);
        s.q(i22, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(r14);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56), converters);
        } else {
            i23 = 4;
            i24 = 3;
            anyType7 = anyType15;
        }
        s.q(i23, "P7");
        co0.d dVarB15 = o0.b(r14);
        s.q(i24, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            s.p();
            ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 = new wn0.a<q>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(r14);
            i25 = 3;
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, viewDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57), converters);
        } else {
            i25 = 3;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.views.ViewDefinitionBuilder.AsyncFunction.32
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.g((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6], (P7) objArr[7]);
            }
        };
        s.q(i25, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            str = name;
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, lVar);
        } else {
            str = name;
            if (s.f(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str, anyTypeArr, lVar);
            }
        }
        getAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final AsyncFunctionBuilder AsyncFunction(String name) {
        s.k(name, "name");
        AsyncFunctionBuilder asyncFunctionBuilder = new AsyncFunctionBuilder(name, this.converters);
        this.functionBuilders.put(name, asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }
}
