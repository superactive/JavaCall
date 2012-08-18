#include <iostream>

#include "clslib.h"

int main(int argc, char *argv[]) {
    ClsLib *clslib = ClsLib::create();
    std::cout << clslib->getName() << std::endl;
    ClsLib::destroy(clslib);
    return 0;
}
