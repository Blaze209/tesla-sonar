package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.v0;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Gender;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0018\u0002\n\u0002\b+\u0018\u0000 W2\u00020\u0001:\u0001jB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b#\u0010!J\u001f\u0010%\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b%\u0010\u0016J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\u000eJ\u0015\u0010'\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000eJ\u001b\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\u0004\b*\u0010+J%\u0010/\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b2\u0010!J\u001d\u00104\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b6\u0010\u0016J\u001f\u00108\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b8\u0010!J\u001d\u0010:\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\b:\u00105J\u001d\u0010;\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\b;\u00105J\u001f\u0010=\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b=\u0010!J\u001f\u0010>\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b>\u0010!J\u001d\u0010?\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b?\u00105J\u001d\u0010@\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b@\u00105J\u001f\u0010A\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bA\u0010!J\u001d\u0010B\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bB\u00105J\u001d\u0010C\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bC\u00105J\u001d\u0010D\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bD\u00105J\u001d\u0010E\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bE\u00105J\u001d\u0010F\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bF\u00105J\u001d\u0010G\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bG\u00105J\u001d\u0010H\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\bH\u00105J\u001d\u0010J\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u0002¢\u0006\u0004\bJ\u00105J\u001d\u0010K\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bK\u00105J\u001d\u0010L\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bL\u00105J\u001f\u0010N\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bN\u0010!J\u001f\u0010P\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010O\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bP\u0010!J\u001d\u0010Q\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bQ\u00105J\u0017\u0010R\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bR\u0010SJ\u001d\u0010T\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\bT\u00105J\u001d\u0010U\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bU\u00105J\u0017\u0010V\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bV\u0010SJ\u001d\u0010W\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bW\u00105J\u001d\u0010X\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020)¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\bZ\u00105J\u001f\u0010[\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u00010-¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b]\u00105J\u001f\u0010_\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010^\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b_\u0010!J\u001d\u0010a\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0002¢\u0006\u0004\ba\u00105J\u001d\u0010b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bb\u00105J\u001d\u0010c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bc\u00105J\u001d\u0010d\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\bd\u00105J\u001d\u0010e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\be\u00105J\u001d\u0010f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020)¢\u0006\u0004\bf\u0010YJ\u001d\u0010g\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\bg\u00105J\u001d\u0010h\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\bh\u00105J\u001d\u0010i\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\bi\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010dR\u0014\u0010m\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010oR\u0016\u0010q\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010dR\u0016\u0010r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010dR\u0018\u0010t\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010lR\u0018\u0010u\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010lR\u0016\u0010v\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010dR\u0018\u0010x\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010lR\u0018\u0010{\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010lR\u0014\u0010|\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010lR\u0014\u0010}\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010lR\u0014\u0010~\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010lR\u0014\u0010\u007f\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u0010lR\u0015\u0010\u0080\u0001\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bK\u0010lR\u0015\u0010\u0081\u0001\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u0010lR\u001d\u0010\u0084\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bL\u0010?\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u0086\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bZ\u0010?\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001d\u0010\u0088\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bN\u0010?\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001R\u001d\u0010\u008a\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\b#\u0010?\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001d\u0010\u008c\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\b%\u0010?\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001R\u001d\u0010\u008e\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\b:\u0010?\u001a\u0006\b\u008d\u0001\u0010\u0083\u0001R\u001d\u0010\u0090\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bP\u0010?\u001a\u0006\b\u008f\u0001\u0010\u0083\u0001R\u001d\u0010\u0092\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bQ\u0010?\u001a\u0006\b\u0091\u0001\u0010\u0083\u0001R\u001d\u0010\u0094\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bR\u0010?\u001a\u0006\b\u0093\u0001\u0010\u0083\u0001R\u001d\u0010\u0096\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bT\u0010?\u001a\u0006\b\u0095\u0001\u0010\u0083\u0001R\u001d\u0010\u0098\u0001\u001a\u00020)8\u0006X\u0086D¢\u0006\u000e\n\u0004\bU\u0010?\u001a\u0006\b\u0097\u0001\u0010\u0083\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/reactnativecommunity/webview/j;", "", "", "newArch", "<init>", "(Z)V", "Lcom/reactnativecommunity/webview/d;", "webView", "Ljn0/h0;", "j0", "(Lcom/reactnativecommunity/webview/d;)V", "Lcom/reactnativecommunity/webview/o;", "viewWrapper", "h0", "(Lcom/reactnativecommunity/webview/o;)V", "", "h", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/bridge/ReadableMap;", "source", "j", "(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativecommunity/webview/d;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativecommunity/webview/o;", "e", "(Lcom/facebook/react/uimanager/v0;Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/o;", "userAgent", "g0", "(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V", "applicationName", "u", "credential", "v", "l", "m", "", "", "g", "()Ljava/util/Map;", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "n", "(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "mixedContentMode", "S", "allow", "q", "(Lcom/reactnativecommunity/webview/o;Z)V", "d0", "value", "Q", "enabled", "w", "E", "injectedJavaScript", Gender.FEMALE, "G", "I", "H", "J", "K", "c0", "b0", "P", Gender.NONE, "D", "L", "allowFileAccess", "o", "p", "r", "layerTypeString", "t", "cacheModeString", "x", "y", "z", "(Ljava/lang/String;)V", "A", "B", Gender.MALE, "C", "R", "(Lcom/reactnativecommunity/webview/o;I)V", "s", Gender.OTHER, "(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableArray;)V", "T", "overScrollModeString", Gender.UNKNOWN, "disabled", "W", "X", "Y", "Z", "a0", "e0", "f0", "i0", "V", "a", "b", "Ljava/lang/String;", "TAG", "Lcom/reactnativecommunity/webview/g;", "Lcom/reactnativecommunity/webview/g;", "mWebViewConfig", "mAllowsFullscreenVideo", "mAllowsProtectedMedia", "f", "mDownloadingMessage", "mLackPermissionToDownloadMessage", "mHasOnOpenWindowEvent", "Lcom/facebook/react/bridge/ReadableMap;", "mPendingSource", "mUserAgent", "k", "mUserAgentWithApplicationName", "HTML_ENCODING", "HTML_MIME_TYPE", "HTTP_METHOD_POST", "BLANK_URL", "DEFAULT_DOWNLOADING_MESSAGE", "DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE", "getCOMMAND_GO_BACK", "()I", "COMMAND_GO_BACK", "getCOMMAND_GO_FORWARD", "COMMAND_GO_FORWARD", "getCOMMAND_RELOAD", "COMMAND_RELOAD", "getCOMMAND_STOP_LOADING", "COMMAND_STOP_LOADING", "getCOMMAND_POST_MESSAGE", "COMMAND_POST_MESSAGE", "getCOMMAND_INJECT_JAVASCRIPT", "COMMAND_INJECT_JAVASCRIPT", "getCOMMAND_LOAD_URL", "COMMAND_LOAD_URL", "getCOMMAND_FOCUS", "COMMAND_FOCUS", "getCOMMAND_CLEAR_FORM_DATA", "COMMAND_CLEAR_FORM_DATA", "getCOMMAND_CLEAR_CACHE", "COMMAND_CLEAR_CACHE", "getCOMMAND_CLEAR_HISTORY", "COMMAND_CLEAR_HISTORY", "react-native-webview_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int COMMAND_CLEAR_CACHE;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int COMMAND_CLEAR_HISTORY;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean newArch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g mWebViewConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean mAllowsFullscreenVideo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean mAllowsProtectedMedia;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String mDownloadingMessage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String mLackPermissionToDownloadMessage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean mHasOnOpenWindowEvent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ReadableMap mPendingSource;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String mUserAgent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String mUserAgentWithApplicationName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String HTML_ENCODING;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String HTML_MIME_TYPE;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String HTTP_METHOD_POST;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String BLANK_URL;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String DEFAULT_DOWNLOADING_MESSAGE;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final String DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_GO_BACK;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_GO_FORWARD;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_RELOAD;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_STOP_LOADING;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_POST_MESSAGE;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_INJECT_JAVASCRIPT;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_LOAD_URL;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_FOCUS;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int COMMAND_CLEAR_FORM_DATA;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/reactnativecommunity/webview/j$b", "Lcom/reactnativecommunity/webview/c;", "Landroid/graphics/Bitmap;", "getDefaultVideoPoster", "()Landroid/graphics/Bitmap;", "react-native-webview_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends com.reactnativecommunity.webview.c {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/reactnativecommunity/webview/j$c", "Lcom/reactnativecommunity/webview/c;", "Landroid/graphics/Bitmap;", "getDefaultVideoPoster", "()Landroid/graphics/Bitmap;", "Landroid/view/View;", "view", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "callback", "Ljn0/h0;", "onShowCustomView", "(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V", "onHideCustomView", "()V", "react-native-webview_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.reactnativecommunity.webview.c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Activity f48630o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f48631p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Activity activity, int i11) {
            super(dVar);
            this.f48630o = activity;
            this.f48631p = i11;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (this.f48549b == null) {
                return;
            }
            ViewGroup viewGroupC = c();
            if (viewGroupC.getRootView() != this.f48548a.getRootView()) {
                this.f48548a.getRootView().setVisibility(0);
            } else {
                this.f48548a.setVisibility(0);
            }
            this.f48630o.getWindow().clearFlags(512);
            viewGroupC.removeView(this.f48549b);
            this.f48550c.onCustomViewHidden();
            this.f48549b = null;
            this.f48550c = null;
            this.f48630o.setRequestedOrientation(this.f48631p);
            this.f48548a.getThemedReactContext().removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
            s.k(view, "view");
            s.k(callback, "callback");
            if (this.f48549b != null) {
                callback.onCustomViewHidden();
                return;
            }
            this.f48549b = view;
            this.f48550c = callback;
            this.f48630o.setRequestedOrientation(-1);
            this.f48549b.setSystemUiVisibility(7942);
            this.f48630o.getWindow().setFlags(512, 512);
            this.f48549b.setBackgroundColor(-16777216);
            ViewGroup viewGroupC = c();
            viewGroupC.addView(this.f48549b, com.reactnativecommunity.webview.c.f48547n);
            if (viewGroupC.getRootView() != this.f48548a.getRootView()) {
                this.f48548a.getRootView().setVisibility(8);
            } else {
                this.f48548a.setVisibility(8);
            }
            this.f48548a.getThemedReactContext().addLifecycleEventListener(this);
        }
    }

    public j() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar, j jVar, String str, String str2, String str3, String str4, long j11) {
        RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) dVar.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
        if (rNCWebViewModule == null) {
            return;
        }
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String strA = p.a(str, str3, str4);
            s.h(strA);
            String strJ = k.a().j(strA, "_");
            String str5 = "Downloading " + strJ;
            try {
                URL url = new URL(str);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e11) {
                Log.w(jVar.TAG, "Error getting cookie for DownloadManager", e11);
            }
            request.addRequestHeader("User-Agent", str2);
            request.setTitle(strJ);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strJ);
            rNCWebViewModule.setDownloadRequest(request);
            if (rNCWebViewModule.grantFileDownloaderPermissions(jVar.h(), jVar.i())) {
                rNCWebViewModule.downloadFile(jVar.h());
            }
        } catch (IllegalArgumentException e12) {
            Log.w(jVar.TAG, "Unsupported URI, aborting download", e12);
        }
    }

    private final String h() {
        String str = this.mDownloadingMessage;
        return str == null ? this.DEFAULT_DOWNLOADING_MESSAGE : str;
    }

    private final void h0(o viewWrapper) {
        d webView = viewWrapper.getWebView();
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    private final String i() {
        String str = this.mLackPermissionToDownloadMessage;
        return str == null ? this.DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE : str;
    }

    private final void j(o viewWrapper, ReadableMap source) {
        byte[] bytes;
        d webView = viewWrapper.getWebView();
        if (source != null) {
            if (source.hasKey("html")) {
                String string = source.getString("html");
                String string2 = source.hasKey("baseUrl") ? source.getString("baseUrl") : "";
                s.h(string);
                webView.loadDataWithBaseURL(string2, string, this.HTML_MIME_TYPE, this.HTML_ENCODING, null);
                return;
            }
            if (source.hasKey("uri")) {
                String string3 = source.getString("uri");
                String url = webView.getUrl();
                if (url == null || !s.f(url, string3)) {
                    if (source.hasKey("method") && t.M(source.getString("method"), this.HTTP_METHOD_POST, true)) {
                        if (source.hasKey("body")) {
                            String string4 = source.getString("body");
                            try {
                                s.h(string4);
                                Charset charsetForName = Charset.forName("UTF-8");
                                s.j(charsetForName, "forName(...)");
                                bytes = string4.getBytes(charsetForName);
                                s.j(bytes, "getBytes(...)");
                            } catch (UnsupportedEncodingException unused) {
                                s.h(string4);
                                bytes = string4.getBytes(p013kotlin.text.d.UTF_8);
                                s.j(bytes, "getBytes(...)");
                            }
                        } else {
                            bytes = null;
                        }
                        if (bytes == null) {
                            bytes = new byte[0];
                        }
                        s.h(string3);
                        webView.postUrl(string3, bytes);
                        return;
                    }
                    HashMap map = new HashMap();
                    if (source.hasKey("headers")) {
                        if (this.newArch) {
                            ReadableArray array = source.getArray("headers");
                            s.h(array);
                            Iterator<Object> it = array.toArrayList().iterator();
                            s.j(it, "iterator(...)");
                            while (it.hasNext()) {
                                Object next = it.next();
                                s.i(next, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                                HashMap map2 = (HashMap) next;
                                String str = (String) map2.get("name");
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = (String) map2.get("value");
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Locale ENGLISH = Locale.ENGLISH;
                                s.j(ENGLISH, "ENGLISH");
                                String lowerCase = str.toLowerCase(ENGLISH);
                                s.j(lowerCase, "toLowerCase(...)");
                                if (s.f("user-agent", lowerCase)) {
                                    webView.getSettings().setUserAgentString(str2);
                                } else {
                                    map.put(str, str2);
                                }
                            }
                        } else {
                            ReadableMap map3 = source.getMap("headers");
                            s.h(map3);
                            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map3.keySetIterator();
                            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                                Locale ENGLISH2 = Locale.ENGLISH;
                                s.j(ENGLISH2, "ENGLISH");
                                String lowerCase2 = strNextKey.toLowerCase(ENGLISH2);
                                s.j(lowerCase2, "toLowerCase(...)");
                                if (s.f("user-agent", lowerCase2)) {
                                    webView.getSettings().setUserAgentString(map3.getString(strNextKey));
                                } else {
                                    map.put(strNextKey, map3.getString(strNextKey));
                                }
                            }
                        }
                    }
                    s.h(string3);
                    webView.loadUrl(string3, map);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(this.BLANK_URL);
    }

    private final void j0(d webView) {
        Activity currentActivity = webView.getThemedReactContext().getCurrentActivity();
        if (this.mAllowsFullscreenVideo && currentActivity != null) {
            c cVar = new c(webView, currentActivity, currentActivity.getRequestedOrientation());
            cVar.f(this.mAllowsProtectedMedia);
            cVar.g(this.mHasOnOpenWindowEvent);
            webView.setWebChromeClient(cVar);
            return;
        }
        com.reactnativecommunity.webview.c cVar2 = (com.reactnativecommunity.webview.c) webView.getWebChromeClient();
        if (cVar2 != null) {
            cVar2.onHideCustomView();
        }
        b bVar = new b(webView);
        bVar.f(this.mAllowsProtectedMedia);
        bVar.g(this.mHasOnOpenWindowEvent);
        webView.setWebChromeClient(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WebView webView) {
    }

    public final void A(o viewWrapper, boolean enabled) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (jb.f.a("FORCE_DARK")) {
                jb.d.b(webView.getSettings(), enabled ? 2 : 0);
            }
            if (enabled && jb.f.a("FORCE_DARK_STRATEGY")) {
                jb.d.c(webView.getSettings(), 2);
            }
        }
    }

    public final void B(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setGeolocationEnabled(value);
    }

    public final void C(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.mHasOnOpenWindowEvent = value;
        j0(webView);
    }

    public final void D(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHasScrollEvent(value);
    }

    public final void E(o viewWrapper, boolean enabled) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (enabled) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    public final void F(o viewWrapper, String injectedJavaScript) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f48563a = injectedJavaScript;
    }

    public final void G(o viewWrapper, String value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f48564b = value;
    }

    public final void H(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f48568f = value;
    }

    public final void I(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f48567e = value;
    }

    public final void J(o viewWrapper, String value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setInjectedJavaScriptObject(value);
    }

    public final void K(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(value);
    }

    public final void L(o viewWrapper, boolean enabled) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptEnabled(enabled);
    }

    public final void M(String value) {
        this.mLackPermissionToDownloadMessage = value;
    }

    public final void N(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(value);
    }

    public final void O(o viewWrapper, ReadableArray value) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (value == null) {
            webView.setMenuCustomItems(null);
            return;
        }
        ArrayList<Object> arrayList = value.toArrayList();
        s.i(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        webView.setMenuCustomItems(arrayList);
    }

    public final void P(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setMessagingEnabled(value);
    }

    public final void Q(o viewWrapper, String value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f48570h = value;
    }

    public final void R(o viewWrapper, int value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMinimumFontSize(value);
    }

    public final void S(o viewWrapper, String mixedContentMode) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (mixedContentMode == null || s.f(PermissionsResponse.PERMISSION_EXPIRES_NEVER, mixedContentMode)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (s.f(PermissionsResponse.SCOPE_ALWAYS, mixedContentMode)) {
            webView.getSettings().setMixedContentMode(0);
        } else if (s.f("compatibility", mixedContentMode)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    public final void T(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f48576n = value;
    }

    public final void U(o viewWrapper, String overScrollModeString) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        int i11 = 0;
        if (overScrollModeString != null) {
            int iHashCode = overScrollModeString.hashCode();
            if (iHashCode == -1414557169) {
                overScrollModeString.equals(PermissionsResponse.SCOPE_ALWAYS);
            } else if (iHashCode != 104712844) {
                if (iHashCode == 951530617 && overScrollModeString.equals("content")) {
                    i11 = 1;
                }
            } else if (overScrollModeString.equals(PermissionsResponse.PERMISSION_EXPIRES_NEVER)) {
                i11 = 2;
            }
        }
        webView.setOverScrollMode(i11);
    }

    public final void V(o viewWrapper, boolean enabled) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (jb.f.a("PAYMENT_REQUEST")) {
            jb.d.d(webView.getSettings(), enabled);
        }
    }

    public final void W(o viewWrapper, boolean disabled) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSaveFormData(!disabled);
    }

    public final void X(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        webView.getSettings().setLoadWithOverviewMode(value);
        webView.getSettings().setUseWideViewPort(value);
    }

    public final void Y(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setBuiltInZoomControls(value);
    }

    public final void Z(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDisplayZoomControls(value);
    }

    public final void a0(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSupportMultipleWindows(value);
    }

    public final void b0(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHorizontalScrollBarEnabled(value);
    }

    public final d c(v0 context) {
        s.k(context, "context");
        return new d(context);
    }

    public final void c0(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setVerticalScrollBarEnabled(value);
    }

    public final o d(v0 context) {
        s.k(context, "context");
        return e(context, c(context));
    }

    public final void d0(o viewWrapper, ReadableMap source) {
        s.k(viewWrapper, "viewWrapper");
        this.mPendingSource = source;
    }

    public final o e(v0 context, final d webView) {
        s.k(context, "context");
        s.k(webView, "webView");
        j0(webView);
        context.addLifecycleEventListener(webView);
        this.mWebViewConfig.a(webView);
        WebSettings settings = webView.getSettings();
        s.j(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (ln.a.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.setDownloadListener(new DownloadListener() { // from class: com.reactnativecommunity.webview.i
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                j.f(webView, this, str, str2, str3, str4, j11);
            }
        });
        return new o(context, webView);
    }

    public final void e0(o viewWrapper, int value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setTextZoom(value);
    }

    public final void f0(o viewWrapper, boolean enabled) {
        s.k(viewWrapper, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(viewWrapper.getWebView(), enabled);
    }

    public final Map<String, Integer> g() {
        return jn.c.a().b("goBack", Integer.valueOf(this.COMMAND_GO_BACK)).b("goForward", Integer.valueOf(this.COMMAND_GO_FORWARD)).b("reload", Integer.valueOf(this.COMMAND_RELOAD)).b("stopLoading", Integer.valueOf(this.COMMAND_STOP_LOADING)).b("postMessage", Integer.valueOf(this.COMMAND_POST_MESSAGE)).b("injectJavaScript", Integer.valueOf(this.COMMAND_INJECT_JAVASCRIPT)).b("loadUrl", Integer.valueOf(this.COMMAND_LOAD_URL)).b("requestFocus", Integer.valueOf(this.COMMAND_FOCUS)).b("clearFormData", Integer.valueOf(this.COMMAND_CLEAR_FORM_DATA)).b("clearCache", Integer.valueOf(this.COMMAND_CLEAR_CACHE)).b("clearHistory", Integer.valueOf(this.COMMAND_CLEAR_HISTORY)).a();
    }

    public final void g0(o viewWrapper, String userAgent) {
        s.k(viewWrapper, "viewWrapper");
        this.mUserAgent = userAgent;
        h0(viewWrapper);
    }

    public final void i0(o viewWrapper, boolean enabled) {
        s.k(viewWrapper, "viewWrapper");
        WebView.setWebContentsDebuggingEnabled(enabled);
    }

    public final void l(o viewWrapper) {
        s.k(viewWrapper, "viewWrapper");
        ReadableMap readableMap = this.mPendingSource;
        if (readableMap != null) {
            j(viewWrapper, readableMap);
        }
        this.mPendingSource = null;
    }

    public final void m(o viewWrapper) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.c();
        webView.f48579q = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n(o viewWrapper, String commandId, ReadableArray args) {
        s.k(viewWrapper, "viewWrapper");
        s.k(commandId, "commandId");
        s.k(args, "args");
        d webView = viewWrapper.getWebView();
        switch (commandId.hashCode()) {
            case -1241591313:
                if (commandId.equals("goBack")) {
                    webView.goBack();
                    return;
                }
                return;
            case -948122918:
                if (commandId.equals("stopLoading")) {
                    webView.stopLoading();
                    return;
                }
                return;
            case -934641255:
                if (commandId.equals("reload")) {
                    webView.reload();
                    return;
                }
                return;
            case -759238347:
                if (commandId.equals("clearCache")) {
                    webView.clearCache(args.getBoolean(0));
                    return;
                }
                return;
            case -318289731:
                if (commandId.equals("goForward")) {
                    webView.goForward();
                    return;
                }
                return;
            case -265032709:
                if (commandId.equals("clearFormData")) {
                    webView.clearFormData();
                    return;
                }
                return;
            case 336631465:
                if (commandId.equals("loadUrl")) {
                    String string = args.getString(0);
                    if (string == null) {
                        throw new RuntimeException("Arguments for loading an url are null!");
                    }
                    webView.f48577o.b(false);
                    webView.loadUrl(string);
                    return;
                }
                return;
            case 903120263:
                if (commandId.equals("clearHistory")) {
                    webView.clearHistory();
                    return;
                }
                return;
            case 1280029577:
                if (commandId.equals("requestFocus")) {
                    webView.requestFocus();
                    return;
                }
                return;
            case 1490029383:
                if (commandId.equals("postMessage")) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", args.getString(0));
                        webView.h("(function () {var event;var data = " + jSONObject + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                        return;
                    } catch (JSONException e11) {
                        throw new RuntimeException(e11);
                    }
                }
                return;
            case 2104576510:
                if (commandId.equals("injectJavaScript")) {
                    webView.h(args.getString(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void o(o viewWrapper, boolean allowFileAccess) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccess(allowFileAccess);
    }

    public final void p(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccessFromFileURLs(value);
    }

    public final void q(o viewWrapper, boolean allow) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(allow);
    }

    public final void r(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.mAllowsFullscreenVideo = value;
        j0(webView);
    }

    public final void s(o viewWrapper, boolean enabled) {
        WebChromeClient webChromeClient;
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.mAllowsProtectedMedia = enabled;
        if (Build.VERSION.SDK_INT < 26 || (webChromeClient = webView.getWebChromeClient()) == null || !(webChromeClient instanceof com.reactnativecommunity.webview.c)) {
            return;
        }
        ((com.reactnativecommunity.webview.c) webChromeClient).f(enabled);
    }

    public final void t(o viewWrapper, String layerTypeString) {
        int i11;
        s.k(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (s.f(layerTypeString, "hardware")) {
            i11 = 2;
        } else {
            i11 = s.f(layerTypeString, "software") ? 1 : 0;
        }
        webView.setLayerType(i11, null);
    }

    public final void u(o viewWrapper, String applicationName) {
        s.k(viewWrapper, "viewWrapper");
        if (applicationName != null) {
            this.mUserAgentWithApplicationName = WebSettings.getDefaultUserAgent(viewWrapper.getWebView().getContext()) + " " + applicationName;
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        h0(viewWrapper);
    }

    public final void v(o viewWrapper, ReadableMap credential) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setBasicAuthCredential((credential != null && credential.hasKey("username") && credential.hasKey("password")) ? new a(credential.getString("username"), credential.getString("password")) : null);
    }

    public final void w(o viewWrapper, boolean enabled) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setCacheMode(enabled ? -1 : 2);
    }

    public final void x(o viewWrapper, String cacheModeString) {
        s.k(viewWrapper, "viewWrapper");
        WebSettings settings = viewWrapper.getWebView().getSettings();
        int i11 = -1;
        if (cacheModeString != null) {
            switch (cacheModeString.hashCode()) {
                case -2059164003:
                    if (cacheModeString.equals("LOAD_NO_CACHE")) {
                        i11 = 2;
                    }
                    break;
                case -1215135800:
                    cacheModeString.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (cacheModeString.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i11 = 1;
                    }
                    break;
                case 1548620642:
                    if (cacheModeString.equals("LOAD_CACHE_ONLY")) {
                        i11 = 3;
                    }
                    break;
            }
        }
        settings.setCacheMode(i11);
    }

    public final void y(o viewWrapper, boolean value) {
        s.k(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDomStorageEnabled(value);
    }

    public final void z(String value) {
        this.mDownloadingMessage = value;
    }

    public j(boolean z11) {
        this.newArch = z11;
        this.TAG = "RNCWebViewManagerImpl";
        this.mWebViewConfig = new g() { // from class: com.reactnativecommunity.webview.h
            @Override // com.reactnativecommunity.webview.g
            public final void a(WebView webView) {
                j.k(webView);
            }
        };
        this.HTML_ENCODING = "UTF-8";
        this.HTML_MIME_TYPE = "text/html";
        this.HTTP_METHOD_POST = "POST";
        this.BLANK_URL = "about:blank";
        this.DEFAULT_DOWNLOADING_MESSAGE = "Downloading";
        this.DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
        this.COMMAND_GO_BACK = 1;
        this.COMMAND_GO_FORWARD = 2;
        this.COMMAND_RELOAD = 3;
        this.COMMAND_STOP_LOADING = 4;
        this.COMMAND_POST_MESSAGE = 5;
        this.COMMAND_INJECT_JAVASCRIPT = 6;
        this.COMMAND_LOAD_URL = 7;
        this.COMMAND_FOCUS = 8;
        this.COMMAND_CLEAR_FORM_DATA = 1000;
        this.COMMAND_CLEAR_CACHE = 1001;
        this.COMMAND_CLEAR_HISTORY = 1002;
    }

    public /* synthetic */ j(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
