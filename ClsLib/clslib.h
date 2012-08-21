#ifndef CLSLIB_H
#define CLSLIB_H

#include <QtCore/qglobal.h>

#if defined(CLSLIB_LIBRARY)
#  define CLSLIBSHARED_EXPORT Q_DECL_EXPORT
#else
#  define CLSLIBSHARED_EXPORT Q_DECL_IMPORT
#endif

#ifdef SWIG
#  ifdef CLSLIBSHARED_EXPORT
#    undef CLSLIBSHARED_EXPORT
#    define CLSLIBSHARED_EXPORT
#  endif
#endif

class CLSLIBSHARED_EXPORT ClsSpi {
public:
    virtual void onLogin(int loginId) {}
};

class CLSLIBSHARED_EXPORT ClsApi {
public:
    static ClsApi *create();
    static void destroy(ClsApi *api);
    virtual void init() = 0;
    virtual void registerSpi(ClsSpi *spi) = 0;
    virtual int reqLogin(int loginId) = 0;
protected:
    virtual ~ClsApi() {}
};

#endif // CLSLIB_H
