/* eslint-disable @typescript-eslint/no-var-requires */
/**
 * local images are loaded as modules,
 * added ?.default to load local images after react-scripts upgrade
 * @see:https://github.com/facebook/create-react-app/issues/9992
 * */
export const icons: { [key: string]: string } = {
  logo: require("./logo.svg")?.default,
};
