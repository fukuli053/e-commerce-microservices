# Base Package
FROM node:14

# Create app directory
WORKDIR /usr/src/app

# Install app dependencies
COPY ./client/package*.json ./

RUN npm install

# Bundle app source
COPY . .

# Initiate npm start
CMD [ "npm", "run-script", "start_docker_dev" ]