package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.contacts.Columns;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/AddToCalendarModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "event", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "createCalendarEvent", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "", "getCalendarID", "()I", "calendarID", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddToCalendarModule extends ReactContextBaseJavaModule {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCalendarModule(ReactApplicationContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.context = reactContext.getApplicationContext();
    }

    private final int getCalendarID() {
        String[] strArr = {Columns.ID, "calendar_displayName"};
        ContentResolver contentResolver = this.context.getContentResolver();
        Uri uri = CalendarContract.Calendars.CONTENT_URI;
        Cursor cursorQuery = contentResolver.query(uri, strArr, "visible = 1 AND isPrimary=1", null, "_id ASC");
        if (cursorQuery != null && cursorQuery.getCount() <= 0) {
            cursorQuery = this.context.getContentResolver().query(uri, strArr, "visible = 1", null, "_id ASC");
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return 1;
        }
        String string = cursorQuery.getString(cursorQuery.getColumnIndex(strArr[0]));
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return Integer.parseInt(string);
    }

    @ReactMethod
    public final void createCalendarEvent(ReadableMap event, Promise promise) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI).putExtra("title", event.getString("title")).putExtra("eventLocation", event.getString("location")).putExtra("beginTime", (long) event.getDouble("startDate")).putExtra("endTime", (long) event.getDouble("endDate")).putExtra("calendar_id", getCalendarID());
        if (intent.resolveActivity(this.context.getPackageManager()) == null || getCurrentActivity() == null) {
            promise.reject(new IllegalStateException("intent resolve error"));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        p013kotlin.jvm.internal.s.h(currentActivity);
        currentActivity.startActivity(intent);
        promise.resolve(null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AddToCalendar";
    }
}
