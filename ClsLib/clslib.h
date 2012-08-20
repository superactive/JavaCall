#ifndef CLSLIB_H
#define CLSLIB_H

#include <string>
#include "ClsLib_global.h"

class CLSLIBSHARED_EXPORT ClsLib {
public:
    static ClsLib *create();
    static void destroy(ClsLib *clslib);

    ClsLib();
    ~ClsLib();

    virtual void hello_virtual();
    std::string getName();
private:
    std::string mName;
};

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
