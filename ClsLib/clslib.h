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

#endif // CLSLIB_H
