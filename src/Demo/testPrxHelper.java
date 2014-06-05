// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Demo;

// <auto-generated>
//
// Generated from file `demo.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


public final class testPrxHelper extends Ice.ObjectPrxHelperBase implements testPrx
{
    public String
    execute(String mth, String cmd)
    {
        return execute(mth, cmd, null, false);
    }

    public String
    execute(String mth, String cmd, java.util.Map<String, String> __ctx)
    {
        return execute(mth, cmd, __ctx, true);
    }

    private String
    execute(String mth, String cmd, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("execute");
                __delBase = __getDelegate(false);
                _testDel __del = (_testDel)__delBase;
                return __del.execute(mth, cmd, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __execute_name = "execute";

    public Ice.AsyncResult begin_execute(String mth, String cmd)
    {
        return begin_execute(mth, cmd, null, false, null);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, java.util.Map<String, String> __ctx)
    {
        return begin_execute(mth, cmd, __ctx, true, null);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, Ice.Callback __cb)
    {
        return begin_execute(mth, cmd, null, false, __cb);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_execute(mth, cmd, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, Callback_test_execute __cb)
    {
        return begin_execute(mth, cmd, null, false, __cb);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, java.util.Map<String, String> __ctx, Callback_test_execute __cb)
    {
        return begin_execute(mth, cmd, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_execute(String mth, String cmd, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__execute_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __execute_name, __cb);
        try
        {
            __result.__prepare(__execute_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeString(mth);
            __os.writeString(cmd);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public String end_execute(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __execute_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        String __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readString();
        __is.endReadEncaps();
        return __ret;
    }

    public static testPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        testPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (testPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Demo::test"))
                {
                    testPrxHelper __h = new testPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static testPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        testPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (testPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Demo::test", __ctx))
                {
                    testPrxHelper __h = new testPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static testPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        testPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Demo::test"))
                {
                    testPrxHelper __h = new testPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static testPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        testPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Demo::test", __ctx))
                {
                    testPrxHelper __h = new testPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static testPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        testPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (testPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                testPrxHelper __h = new testPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static testPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        testPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            testPrxHelper __h = new testPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _testDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _testDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, testPrx v)
    {
        __os.writeProxy(v);
    }

    public static testPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            testPrxHelper result = new testPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}