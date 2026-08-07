package com.content.pushprovisioning;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.URLUtil;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.bumptech.glide.l;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.h;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import s10.e;
import uj.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107¨\u0006;"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/b;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/bumptech/glide/l;", "requestManager", "<init>", "(Lcom/facebook/react/uimanager/v0;Lcom/bumptech/glide/l;)V", "Lcom/facebook/react/bridge/ReadableMap;", "sourceMap", "", "f", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Object;", "", "performClick", "()Z", "Ljn0/h0;", "g", "()V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "map", "setSourceMap", "(Lcom/facebook/react/bridge/ReadableMap;)V", "detailsMap", "setCardDetails", "setEphemeralKey", "setToken", "Lcom/facebook/react/bridge/WritableMap;", AnalyticsAttribute.Error, "e", "(Lcom/facebook/react/bridge/WritableMap;)V", "c", "Lcom/facebook/react/uimanager/v0;", DateTokenConverter.CONVERTER_KEY, "Lcom/bumptech/glide/l;", "Lcom/facebook/react/bridge/ReadableMap;", "cardDetails", "", "Ljava/lang/String;", "ephemeralKey", "token", "Lcom/facebook/react/uimanager/events/EventDispatcher;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "j", "Ljava/lang/Object;", "loadedSource", "k", "I", "heightOverride", "l", "widthOverride", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends AppCompatImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l requestManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ReadableMap cardDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String ephemeralKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ReadableMap sourceMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ReadableMap token;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private EventDispatcher eventDispatcher;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Object loadedSource;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int heightOverride;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int widthOverride;

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J;\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/reactnativestripesdk/pushprovisioning/b$a", "Lcom/bumptech/glide/request/h;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Luj/j;", "target", "", "isFirstResource", "onLoadFailed", "(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Luj/j;Z)Z", "resource", "Ldj/a;", "dataSource", "a", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Luj/j;Ldj/a;Z)Z", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements h<Drawable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f48878b;

        a(Object obj) {
            this.f48878b = obj;
        }

        @Override // com.bumptech.glide.request.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable resource, Object model, j<Drawable> target, dj.a dataSource, boolean isFirstResource) {
            b.this.setImageDrawable(new RippleDrawable(ColorStateList.valueOf(Color.parseColor("#e0e0e0")), resource, null));
            return true;
        }

        @Override // com.bumptech.glide.request.h
        public boolean onLoadFailed(GlideException e11, Object model, j<Drawable> target, boolean isFirstResource) {
            b.this.e(e.d("Failed", "Failed to load the source from " + this.f48878b));
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v0 context, l requestManager) {
        super(context);
        s.k(context, "context");
        s.k(requestManager, "requestManager");
        this.context = context;
        this.requestManager = requestManager;
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.eventDispatcher = uIManagerModule != null ? uIManagerModule.getEventDispatcher() : null;
        setOnTouchListener(new View.OnTouchListener() { // from class: com.reactnativestripesdk.pushprovisioning.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return b.d(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        view.performClick();
        return true;
    }

    private final Object f(ReadableMap sourceMap) {
        String string;
        if (sourceMap == null || (string = sourceMap.getString("uri")) == null) {
            return null;
        }
        return URLUtil.isValidUrl(string) ? new jj.h(string) : Integer.valueOf(this.context.getResources().getIdentifier(string, "drawable", this.context.getPackageName()));
    }

    public final void e(WritableMap error) {
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.h(new c(getId(), error));
        }
    }

    public final void g() {
        Object objF = f(this.sourceMap);
        if (objF == null) {
            this.requestManager.clear(this);
            setImageDrawable(null);
            this.loadedSource = null;
        } else if (!s.f(objF, this.loadedSource) || this.heightOverride > 0 || this.widthOverride > 0) {
            this.loadedSource = objF;
            ReadableMap readableMap = this.sourceMap;
            double d11 = readableMap != null ? readableMap.getDouble("scale") : 1.0d;
            this.requestManager.mo78load(objF).addListener(new a(objF)).centerCrop().override((int) (((double) this.widthOverride) * d11), (int) (((double) this.heightOverride) * d11)).into(this);
        }
    }

    public final void h() {
        this.requestManager.clear(this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 <= 0 || h11 <= 0) {
            return;
        }
        this.heightOverride = h11;
        this.widthOverride = w11;
        g();
        this.heightOverride = 0;
        this.widthOverride = 0;
    }

    @Override // android.view.View
    public boolean performClick() {
        String string;
        super.performClick();
        ReadableMap readableMap = this.cardDetails;
        if (readableMap == null || (string = readableMap.getString("description")) == null) {
            e(e.d("Failed", "Missing parameters. `cardDetails.cardDescription` must be supplied in the props to <AddToWalletButton />"));
            return true;
        }
        String str = this.ephemeralKey;
        if (str == null) {
            e(e.d("Failed", "Missing parameters. `ephemeralKey` must be supplied in the props to <AddToWalletButton />"));
            return true;
        }
        f fVar = f.f48883a;
        ReactApplicationContext reactApplicationContextB = this.context.b();
        s.j(reactApplicationContextB, "getReactApplicationContext(...)");
        fVar.e(reactApplicationContextB, this, string, str, this.token);
        return true;
    }

    public final void setCardDetails(ReadableMap detailsMap) {
        s.k(detailsMap, "detailsMap");
        this.cardDetails = detailsMap;
    }

    public final void setEphemeralKey(ReadableMap map) {
        s.k(map, "map");
        this.ephemeralKey = map.toHashMap().toString();
    }

    public final void setSourceMap(ReadableMap map) {
        s.k(map, "map");
        this.sourceMap = map;
    }

    public final void setToken(ReadableMap map) {
        this.token = map;
    }
}
