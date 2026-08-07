package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import ch.qos.logback.core.joran.action.Action;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.a;
import expo.modules.contacts.Columns;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";

    /* JADX INFO: renamed from: cr, reason: collision with root package name */
    private final ContentResolver f55569cr;
    private final String[] columns = {Columns.ID, Action.KEY_ATTRIBUTE, "type", "value"};
    private final HashMap<String, Object> values = new HashMap<>();
    private REditor editor = null;

    private static class REditor implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: cr, reason: collision with root package name */
        private ContentResolver f55570cr;
        private Map<String, Object> values = new HashMap();
        private Set<String> remove = new HashSet();
        private boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.f55570cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x009a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x003e A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            String str;
            ContentValues contentValues = new ContentValues();
            if (this.clear) {
                this.f55570cr.delete(a.f55572a, null, null);
                this.clear = false;
            }
            Iterator<String> it = this.remove.iterator();
            while (it.hasNext()) {
                this.f55570cr.delete(a.f55572a, "key = ?", new String[]{it.next()});
            }
            Iterator<Map.Entry<String, Object>> it2 = this.values.entrySet().iterator();
            while (true) {
                int i11 = 1;
                if (!it2.hasNext()) {
                    return true;
                }
                Map.Entry<String, Object> next = it2.next();
                Object value = next.getValue();
                if (value == null) {
                    str = "unresolve failed, null value";
                } else {
                    if (!(value instanceof Integer)) {
                        if (value instanceof Long) {
                            i11 = 2;
                        } else if (value instanceof String) {
                            i11 = 3;
                        } else if (value instanceof Boolean) {
                            i11 = 4;
                        } else if (value instanceof Float) {
                            i11 = 5;
                        } else if (value instanceof Double) {
                            i11 = 6;
                        } else {
                            str = "unresolve failed, unknown type=" + value.getClass().toString();
                        }
                    }
                    if (i11 == 0) {
                        contentValues.put("type", Integer.valueOf(i11));
                        contentValues.put("value", value.toString());
                        this.f55570cr.update(a.f55572a, contentValues, "key = ?", new String[]{next.getKey()});
                    }
                }
                Log.e("MicroMsg.SDK.PluginProvider.Resolver", str);
                i11 = 0;
                if (i11 == 0) {
                    contentValues.put("type", Integer.valueOf(i11));
                    contentValues.put("value", value.toString());
                    this.f55570cr.update(a.f55572a, contentValues, "key = ?", new String[]{next.getKey()});
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z11) {
            this.values.put(str, Boolean.valueOf(z11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f11) {
            this.values.put(str, Float.valueOf(f11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i11) {
            this.values.put(str, Integer.valueOf(i11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j11) {
            this.values.put(str, Long.valueOf(j11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.f55569cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor cursorQuery = this.f55569cr.query(a.f55572a, this.columns, "key = ?", new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            Object objA = cursorQuery.moveToFirst() ? com.tencent.mm.opensdk.channel.a.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("type")), cursorQuery.getString(cursorQuery.getColumnIndex("value"))) : null;
            cursorQuery.close();
            return objA;
        } catch (Exception e11) {
            Log.e(TAG, "getValue exception:" + e11.getMessage());
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.f55569cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor cursorQuery = this.f55569cr.query(a.f55572a, this.columns, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex(Action.KEY_ATTRIBUTE);
            int columnIndex2 = cursorQuery.getColumnIndex("type");
            int columnIndex3 = cursorQuery.getColumnIndex("value");
            while (cursorQuery.moveToNext()) {
                this.values.put(cursorQuery.getString(columnIndex), com.tencent.mm.opensdk.channel.a.a.a(cursorQuery.getInt(columnIndex2), cursorQuery.getString(columnIndex3)));
            }
            cursorQuery.close();
            return this.values;
        } catch (Exception e11) {
            Log.e(TAG, "getAll exception:" + e11.getMessage());
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z11 : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f11 : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i11 : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j11 : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
